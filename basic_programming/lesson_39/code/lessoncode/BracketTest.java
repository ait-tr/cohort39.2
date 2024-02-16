import org.junit.Test;

import static org.junit.Assert.*;

public class BracketTest {
    Bracket bracket = new Bracket();

    @Test
    public void testBalancedBrackets() {
        assertTrue(bracket.isBalanced("{[()]}()"));
    }

    @Test
    public void testUnbalancedBrackets() {
        assertFalse(bracket.isBalanced("{[(])}"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(bracket.isBalanced(""));
    }
}