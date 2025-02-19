package orderedarray;

public class OrderedArray {
    private int[] a;
    private int nElems;

    public OrderedArray(int max)
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
        System.out.println("-----Array-----");
        System.out.print("\t");
        for(int i=0; i<nElems; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public int find(int key)
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


    public int size()
    {
        return nElems;
    }


    public boolean delete(int key)
    {
        int index = find(key);
        if(index == -1) return false;

        //shift elements for delete the key
        for(int i = index; i < nElems; i++){
            a[i] = a[i + 1];
        }

        nElems--;
        return true;
    }
}
