package ec.edu.ups.tdd.calculadora;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void give_two_integers_when_addition_then_ok() {
        ICalculator calculator = Mockito.mock(ICalculator.class);
        Mockito.when(calculator.addition(2,3 )).thenReturn(5);

        assertEquals(5,calculator.addition(2,3));
    }
}