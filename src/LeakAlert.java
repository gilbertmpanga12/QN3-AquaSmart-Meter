public class LeakAlert {
    private ConsumptionEvent event;
    private boolean alertRaised;

    public LeakAlert(ConsumptionEvent event) {
        this.event = event;

        if (event.getLitresUsed() > 600) {
            alertRaised = true;
        } else {
            alertRaised = false;
        }
    }

    public ConsumptionEvent getEvent() {
        return event;
    }

    public boolean isAlertRaised() {
        return alertRaised;
    }
}
