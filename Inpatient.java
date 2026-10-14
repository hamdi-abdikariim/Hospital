package Hospital;

class Inpatient extends Patient {
    private double roomCharge;
    private int numberOfDays;

    // Constructor
    public Inpatient(String name, double consultFee,
                     double roomCharge, int numberOfDays) {
        super(name, consultFee);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    // Calculate total bill
    public double CalculateBill() {
        return (numberOfDays * roomCharge) + getConsultFee();
    }

    public void displayInfo() {
        System.out.println("Patient Type: Inpatient");
        System.out.println("Patient Name: " + getName());
        System.out.println("Consult Fee: $" + getConsultFee());
        System.out.println("Room Charge Per Day: $" + roomCharge);
        System.out.println("Number Of Days: " + numberOfDays);
        System.out.println("Total Bill: $" + CalculateBill());
    }
}
