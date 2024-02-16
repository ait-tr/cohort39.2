import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTwoTest {

    PowerTwo powerTwo = new PowerTwo();
    @Test
    public void testIsPowerOfTwoMultiply() {
        assertTrue(powerTwo.isPowerOfTwo(1));
        assertTrue(powerTwo.isPowerOfTwo(2));
        assertTrue(powerTwo.isPowerOfTwo(16));
        assertFalse(powerTwo.isPowerOfTwo(3));
        assertFalse(powerTwo.isPowerOfTwo(0));
        assertFalse(powerTwo.isPowerOfTwo(-2));
    }
}