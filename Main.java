package Hospital;

public class Main {
    public static void main(String[] args) {

        // Create Outpatient object
        Outpatient patient1 =
                new Outpatient("Ahmed", 20.0, 15.0);

        // Create Inpatient object
        Inpatient patient2 =
                new Inpatient("Amina", 30.0, 50.0, 4);

        // Display Outpatient information
        System.out.println("=== OUTPATIENT DETAILS ===");
        patient1.displayInfo();

        System.out.println();

        // Display Inpatient information
        System.out.println("=== INPATIENT DETAILS ===");
        patient2.displayInfo();
    }
}
