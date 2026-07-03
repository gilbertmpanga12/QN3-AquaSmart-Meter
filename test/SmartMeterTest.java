import org.junit.Test;
import static org.junit.Assert.*;

public class SmartMeterTest {
    @Test
    public void loadingTokenReopensClosedValve() {
        SmartMeter meter = new SmartMeter("TEST-001", 100);
        meter.recordConsumption(5);

        assertFalse(meter.isValveOpen());

        meter.loadToken(500);

        assertTrue(meter.isValveOpen());
        assertEquals(500, meter.getCreditBalance(), 0.01);
    }

    @Test
    public void consumingBeyondCreditClosesValve() {
        SmartMeter meter = new SmartMeter("TEST-002", 200);

        boolean result = meter.recordConsumption(10);

        assertTrue(result);
        assertEquals(0, meter.getCreditBalance(), 0.01);
        assertFalse(meter.isValveOpen());
    }
}
