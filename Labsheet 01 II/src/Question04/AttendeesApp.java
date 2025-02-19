package Question04;

public class AttendeesApp {
    public static void main(String[] args) {
        Attendees attendees = new Attendees(50);

        attendees.insert("AB1234");
        attendees.insert("BB1834");
        attendees.insert("AB7234");
        attendees.insert("EF9034");
        attendees.insert("JK5634");

        //insert duplication
        attendees.insert("JK5634");

        //display
        attendees.display();

        //search
        System.out.println("\n");
        attendees.search("AB1234");
        System.out.println("\n");
        attendees.search("AB1274");



    }
}
