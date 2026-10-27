
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(4, calc.divide(20, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calc.divide(10, 0);
    }
}
