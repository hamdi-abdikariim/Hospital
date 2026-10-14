package Hospital;

class Patient {
    private String name;
    private double consultFee;

    // Constructor
    public Patient(String name, double consultFee) {
        this.name = name;
        this.consultFee = consultFee;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getConsultFee() {
        return consultFee;
    }
}