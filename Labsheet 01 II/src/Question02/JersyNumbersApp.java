package Question02;

public class JersyNumbersApp {
    public static void main(String[] args) {

        JersyNumbers jersyNumbers = new JersyNumbers(10);

        jersyNumbers.insert(14);
        jersyNumbers.insert(10);
        jersyNumbers.insert(07);
        jersyNumbers.insert(20);
        jersyNumbers.insert(13);

        jersyNumbers.search(24);
        jersyNumbers.search(10);

        jersyNumbers.display();
    }
}
