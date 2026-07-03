public class Main {
    public static void main(String[] args) {
        SmartMeter meter = new SmartMeter("KIS-KLA-101", 5000);

        System.out.println("AQUASMART METER DEMO - PROJECT 1");
        System.out.println("Meter ID: " + meter.getMeterId());
        System.out.println("Opening credit: UGX " + meter.getCreditBalance());
        System.out.println("Valve open? " + meter.isValveOpen());
        System.out.println();

        boolean firstUse = meter.recordConsumption(40);
        System.out.println("Record 40 litres: " + firstUse);
        System.out.println("Balance: UGX " + meter.getCreditBalance());
        System.out.println("Valve open? " + meter.isValveOpen());
        System.out.println();

        boolean secondUse = meter.recordConsumption(100);
        System.out.println("Record 100 litres: " + secondUse);
        System.out.println("Balance: UGX " + meter.getCreditBalance());
        System.out.println("Valve open? " + meter.isValveOpen());
        System.out.println();

        double newBalance = meter.loadToken(3000);
        System.out.println("Loaded token of UGX 3000");
        System.out.println("New balance: UGX " + newBalance);
        System.out.println("Valve open? " + meter.isValveOpen());
    }
}
