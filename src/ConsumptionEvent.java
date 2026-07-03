public class ConsumptionEvent {
    private String eventNumber;
    private double litresUsed;
    private double amountCharged;

    public ConsumptionEvent(String eventNumber, double litresUsed) {
        this.eventNumber = eventNumber;
        this.litresUsed = litresUsed;
        this.amountCharged = litresUsed * 50;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public double getLitresUsed() {
        return litresUsed;
    }

    public double getAmountCharged() {
        return amountCharged;
    }
}
