public class SmartMeter {
    private String meterId;
    private double creditBalance;
    private boolean valveOpen;

    public SmartMeter(String meterId, double openingCreditBalance) {
        this.meterId = meterId;
        this.creditBalance = openingCreditBalance;
        this.valveOpen = true;
    }

    public double loadToken(double amount) {
        if (amount > 0) {
            creditBalance = creditBalance + amount;
            valveOpen = true;
        }

        return creditBalance;
    }

    public boolean recordConsumption(double litres) {
        double cost = litres * 50;

        if (valveOpen == false || creditBalance <= 0) {
            valveOpen = false;
            return false;
        }

        creditBalance = creditBalance - cost;

        if (creditBalance <= 0) {
            creditBalance = 0;
            valveOpen = false;
        }

        return true;
    }

    public String getMeterId() {
        return meterId;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public boolean isValveOpen() {
        return valveOpen;
    }
}
