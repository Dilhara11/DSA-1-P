package Question05;

public class VechicleArray {
    private String[] regNumbers;
    private int nElems;

    public VechicleArray(int max) {
        regNumbers = new String[max];
    }

    //inserting unique vehicle registration numbers
    public void insert(String regNumber) {
        if (find(regNumber)) {
            System.out.println("Duplication Registration Number cannot insert.");
        } else {
            if (nElems < regNumbers.length) {
                regNumbers[nElems] = regNumber;
                nElems++;
            } else {
                System.out.println("Array is full.cannot insert.");
            }
        }

    }

    //search for registration number
    //set private to deny access

    private boolean find(String searchKey) {
        for (int i = 0; i < nElems; i++) {
            if (regNumbers[i] == searchKey) {
                return true;
            }
        }
        return false;

    }

    public void search(String searchKey) {
        if (find(searchKey)) {
            System.out.println("Vehicle Found!");
        } else {
            System.out.println("Vehicle Not Found!");
        }
    }

    //deleting registration numbers from the list
    public void delete(String regNumber) {

        for (int i = 0; i < nElems; i++) {
            if (regNumbers[i] == regNumber) {
                for (int j = i; j < nElems - 1; j++) {
                    regNumbers[j] = regNumbers[j + 1];
                }
                nElems--;
                System.out.println("Registration number removed!");
                return;
            }
        }
        System.out.println("Registration number not found!");

    }

}

