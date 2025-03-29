package Q3.Scenario_02;

public class CustomerQueueApp {
    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue(5);

        //adding data
        customerQueue.add("Alice");
        customerQueue.add("Bob");
        customerQueue.add("Charlie");
        customerQueue.add("David");
        customerQueue.add("Emma");

        //displaying data
        customerQueue.display();

        System.out.println("Next in Line: " + customerQueue.front());

        //serve customers
        System.out.println("Serving: " + customerQueue.serve());
        System.out.println("Serving: " + customerQueue.serve());

        //display updated line
        customerQueue.display();
    }
}
