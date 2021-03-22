package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FractionTest
{

    @Test
    public void it_should_return_0_when_numerator_is_0(){
        //GIVEN
        Fraction fraction = new Fraction(0,3);

        //WHEN
        double result = fraction.getValue();

        //THEN
        Assertions.assertEquals(0, result);
    }

    @Test
    public void it_should_return_0_25_when_numerator_is_1_and_denominator_is_4(){
        //GIVEN
        Fraction fraction = new Fraction(1,4);

        //WHEN
        double result = fraction.getValue();

        //THEN
        Assertions.assertEquals(0.25, result);
    }

    @Test
    public void it_should_throw_illegal_argument_if_denominator_is_0(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Fraction fraction = new Fraction(1,0);
        });

        String expectedMessage = "Don't divide by 0";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("it should return 2/5 when numerator is 2 and denominator is 5 by getFractionFormat")
    public void it_should_return_14_when_numerator_is_1_and_denominator_is_4(){
        //GIVEN
        Fraction fraction = new Fraction(2,5);

        //WHEN
        String result = fraction.getFractionFormat();

        //THEN
        Assertions.assertEquals("2/5", result);
    }
}
