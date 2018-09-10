import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTests {

    static Calculator calculator;

    @BeforeAll
    public static void setup() {
        System.out.println("We initialize new calculator");
        calculator = new Calculator();
    }


    @Test
    public void summaTest () {
        int c = calculator.summa(2,3);

        assertTrue(c == 5, "[WARNING] We expect TRUE (because 5==5!)");

        //assertEquals(5,c,"WARNING");
    }

    @Test
    @Tag("Critical")
    public void summaBigTest () {
        int c = calculator.summa(700000,243);

        assertTrue(c == 700243, "[WARNING] We expect TRUE (because 5==5!)");

        //assertEquals(5,c,"WARNING");
    }

    @Test
    @DisplayName("PROVERKA RAZN")
    @Tag("Critical")
    public void raznicaTest () {
        int c = calculator.raznica(6,8);
        assertEquals(-2,c,"WARNING");

    }

    @AfterAll
    public static void tear () {
        System.out.println("We kill our calculator");;
        calculator = null;
    }


}
