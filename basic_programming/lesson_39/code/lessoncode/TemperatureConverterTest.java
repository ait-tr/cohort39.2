import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperatureConverterTest {
    private final double DELTA = 0.01; // Точность для сравнения чисел

    @Test
    public void testCelsiusToFahrenheitZero() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), DELTA);
    }

    @Test
    public void testCelsiusToFahrenheit100() {
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), DELTA);
    }

    @Test
    public void testCelsiusToFahrenheitAny() {
        assertEquals(68.0, TemperatureConverter.celsiusToFahrenheit(20), DELTA);
    }
}
