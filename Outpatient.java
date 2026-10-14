package Hospital;

class Outpatient extends Patient {
    private double labCharge;

    // Constructor
    public Outpatient(String name, double consultFee, double labCharge) {
        super(name, consultFee);
        this.labCharge = labCharge;
    }

    // Calculate total bill
    public double CalculateBill() {
        return labCharge + getConsultFee();
    }

    public void displayInfo() {
        System.out.println("Patient Type: Outpatient");
        System.out.println("Patient Name: " + getName());
        System.out.println("Consult Fee: $" + getConsultFee());
        System.out.println("Lab Charge: $" + labCharge);
        System.out.println("Total Bill: $" + CalculateBill());
    }
}