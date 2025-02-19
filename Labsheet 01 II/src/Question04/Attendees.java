package Question04;

public class Attendees {
    private String[] regNumbers;
    private int nElems;

    public Attendees(int max) {
        regNumbers = new String[max];
    }

    //inserting unique vehicle registration numbers
    public void insert(String regNumber) {
        if (find(regNumber) == 1) {
            System.out.println("Duplication Registration Number cannot insert.");
        } else {
            int j;

            //finding the position for new value
            for(j = 0; j < nElems; j++){
                if(regNumbers[j].compareTo(regNumber) > 0) break;
            }

            //shift elements to make room
            for(int k = nElems; k > j; k--) regNumbers[k] = regNumbers[k - 1];

            regNumbers[j] = regNumber;
            nElems++;
            }
        }

    public int find(String key) {
        int lowerBound = 0;
        int upperBound = nElems - 1;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;

            int comparison = regNumbers[mid].compareTo(key);
            if (comparison == 0) return mid; // Found the book
            else if (comparison < 0) lowerBound = mid + 1; // Search right half
            else upperBound = mid - 1; // Search left half
        }
        return -1; // Book not found
    }

    public void display() {
        System.out.println("-----Reg Numbers-----");
        System.out.print("\t");
        for (int i = 0; i < nElems; i++) {
            System.out.print(regNumbers[i] + " ");
        }
        System.out.println();
    }

    public void search(String regNumber){
        if(find(regNumber) == -1) System.out.println("Registration number not found!");
        else System.out.println("Registration number found!");
    }

    }

