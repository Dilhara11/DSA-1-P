package Question02;

public class JersyNumbers {
    private int[] a;
    private int nElems;

    public JersyNumbers(int max)
    {
        a = new int[max];
        nElems=0;
    }

    public void insert(int value)
    {
        int j;

        //finding the position for new value
        for(j = 0; j < nElems; j++){
            if(a[j] > value) break;
        }

        //shift elements to make room
        for(int k = nElems; k > j; k--) a[k] = a[k - 1];

        a[j] = value;
        nElems++;
    }

    public void display()
    {
        System.out.println("-----Jersy Numbers-----");
        System.out.print("\t");
        for(int i=0; i<nElems; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    private int find(int key)
    {
        int lowerBound = 0;
        int upperBound = nElems - 1;

        while (lowerBound <= upperBound){
            int mid = (lowerBound + upperBound)/2;

            if(a[mid] == key) return mid;
            else if (a[mid] < key) lowerBound = mid + 1;
            else upperBound = mid - 1;

        }
        return -1; // key is not found
    }

    public void search(int number){
        if(find(number) == -1) System.out.println("Jersy number Not Found!");
        else System.out.println("Jersy Number Found!");
    }

}
