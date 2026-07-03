public class WaterToken {
    private String tokenCode;
    private double tokenValue;

    public WaterToken(String tokenCode, double tokenValue) {
        this.tokenCode = tokenCode;
        this.tokenValue = tokenValue;
    }

    public double loadInto(SmartMeter meter) {
        return meter.loadToken(tokenValue);
    }

    public String getTokenCode() {
        return tokenCode;
    }

    public double getTokenValue() {
        return tokenValue;
    }
}
