public class NoDupArray {
    //variables
    private long[] a;
    private int nElems;

    //constructors
    public NoDupArray(int max)
    {
        a = new long[max];
        nElems = 0;
    }

//methods

    //insert
    public void insert(long value)
    {
        if(find(value)){
            System.out.println("Value " + value +" Is Already Exists");
        }else{
            if(nElems < a.length){
                a[nElems] = value;
                nElems++;
            }else {
                System.out.println("Array is full.cannot insert value");
            }
        }

    }

    //display
    public void display()
    {
        if(nElems == 0){
            System.out.println("Array is Empty!");
        }else{
            System.out.println("Array content: ");
            for (int i = 0; i < nElems; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    //find
    public boolean find(long searchKey)
    {
        for(int i = 0; i< nElems; i++){
            if(a[i] == searchKey){
                return  true;
            }
        }
        return false;

    }











    //delete
    public boolean delete(long value) {

        for (int i = 0; i < nElems; i++) {
            if (a[i] == value) {
                for (int j = i; j < nElems - 1; j++) {
                    a[j] = a[j + 1];
                }
                nElems--;
                return true;
            }
        }
        return false;
    }

}

