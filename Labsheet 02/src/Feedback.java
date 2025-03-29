public class Feedback {
    //declare variables for array and number of elements
    private int[] feedbacks;
    private int nElems;

    public int getnElems() {
        return nElems;
    }

    public int getFeedbacks(int index) {
        return feedbacks[index];
    }

    //constructor for declaration of array
    public Feedback(int maxFeedbacks) {
        feedbacks = new int[maxFeedbacks];
        this.nElems = 0;
    }

    //method to add customer feedbacks in to array
    public void insert(int feedback) {
        //check space in array
        if (feedbacks.length < nElems) System.out.println("cant include feedback! 'Array is Full'");
        //enough space so adding feedback
        else {
            feedbacks[nElems] = feedback;
            nElems++;
        }
    }

    //finding first occurrence of some rating
    public int find(int key){
        for(int i = 0; i< nElems; i++){
            if(feedbacks[i] == key){
                return key;
            }
        }
        return -1;
    }

    //delete all occurrences of some rating
    public void delete(int key){
        for(int i = 0; i<nElems; i++){
            if(feedbacks[i] == key){
                feedbacks[i] = feedbacks[i + 1];
                System.out.println("deleted!");
                //shrinking the array
                nElems--;
                //to stay same index after a deletion
                i--;
            }
        }
    }

    //method to display array
    public void dislplay(){
        for(int i = 0; i < nElems; i++) System.out.println(feedbacks[i]);
    }

}

