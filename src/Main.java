public class Main {
    public static void main(String[] args) {
        SmartMeter meter = new SmartMeter("KIS-KLA-101", 5000);
        Customer customer = new Customer("Mariam Nakato", "Buwanga Landing Site", meter);

        System.out.println("AQUASMART METER DEMO - PROJECT 1");
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Village: " + customer.getVillage());
        System.out.println("Meter ID: " + customer.getAssignedMeter().getMeterId());
        System.out.println("Opening credit: UGX " + meter.getCreditBalance());
        System.out.println("Valve open? " + meter.isValveOpen());
        System.out.println();

        ConsumptionEvent morningUse = new ConsumptionEvent("EVT-001", 40);
        boolean firstUse = meter.recordConsumption(morningUse.getLitresUsed());
        System.out.println("Record " + morningUse.getLitresUsed() + " litres: " + firstUse);
        System.out.println("Event cost: UGX " + morningUse.getAmountCharged());
        System.out.println("Balance: UGX " + meter.getCreditBalance());
        System.out.println("Valve open? " + meter.isValveOpen());
        System.out.println();

        ConsumptionEvent eveningUse = new ConsumptionEvent("EVT-002", 100);
        boolean secondUse = meter.recordConsumption(eveningUse.getLitresUsed());
        System.out.println("Record " + eveningUse.getLitresUsed() + " litres: " + secondUse);
        System.out.println("Event cost: UGX " + eveningUse.getAmountCharged());
        System.out.println("Balance: UGX " + meter.getCreditBalance());
        System.out.println("Valve open? " + meter.isValveOpen());
        System.out.println();

        WaterToken token = new WaterToken("WT-KIS-3000", 3000);
        double newBalance = token.loadInto(meter);
        System.out.println("Loaded token " + token.getTokenCode() + " of UGX " + token.getTokenValue());
        System.out.println("New balance: UGX " + newBalance);
        System.out.println("Valve open? " + meter.isValveOpen());

        ConsumptionEvent unusualUse = new ConsumptionEvent("EVT-LEAK", 700);
        LeakAlert alert = new LeakAlert(unusualUse);
        System.out.println("Leak check litres: " + alert.getEvent().getLitresUsed());
        System.out.println("Leak alert raised? " + alert.isAlertRaised());
    }
}
