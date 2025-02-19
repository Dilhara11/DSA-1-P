package Question05;

public class VehicleArrayAPP {
    public static void main(String[] args) {
        VechicleArray regNumbers = new VechicleArray(50);

        regNumbers.insert("SW-2345");
        regNumbers.insert("BA-1267");
        regNumbers.insert("GH-6778");
        regNumbers.insert("KL-8990");
        regNumbers.insert("KA-3223");
        regNumbers.insert("QS-7834");


        System.out.println("Inserting duplication Array");
        regNumbers.insert("GH-6778");
        System.out.println("\n");

        System.out.println("Search For Existing reg Number");
        regNumbers.search("KL-8990");
        System.out.println("\n");

        System.out.println("Search For NON Existing reg Number");
        regNumbers.search("KM-8994");
        System.out.println("\n");

        System.out.println("Deleting Existing Registration Number");
        regNumbers.delete("KA-3223");
        System.out.println("\n");

        System.out.println("Deleting NON Existing Registration Number");
        regNumbers.delete("KD-3225");
        System.out.println("\n");
    }
}
