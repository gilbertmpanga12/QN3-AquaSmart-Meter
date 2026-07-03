public class Customer {
    private String fullName;
    private String village;
    private SmartMeter assignedMeter;

    public Customer(String fullName, String village, SmartMeter assignedMeter) {
        this.fullName = fullName;
        this.village = village;
        this.assignedMeter = assignedMeter;
    }

    public String getFullName() {
        return fullName;
    }

    public String getVillage() {
        return village;
    }

    public SmartMeter getAssignedMeter() {
        return assignedMeter;
    }
}
