package org.example;


import org.example.model.Fraction;
import org.example.services.FractionService;
import org.example.services.FractionServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FractionTest
{
    FractionService fractionService = new FractionServiceImpl();

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
    public void it_should_return_25_when_numerator_is_1_and_denominator_is_4(){
        //GIVEN
        Fraction fraction = new Fraction(2,5);

        //WHEN
        String result = fraction.getFractionFormat();

        //THEN
        Assertions.assertEquals("2/5", result);
    }

    @Test
    @DisplayName("it should return 3/6 when numerator is 3 and denominator is 6 by getFractionFormat")
    public void it_should_return_36_when_numerator_is_3_and_denominator_is_6(){
        //GIVEN
        Fraction fraction = new Fraction(3,6);

        //WHEN
        String result = fraction.getFractionFormat();

        //THEN
        Assertions.assertEquals("3/6", result);
    }

    @Test
    @DisplayName("it should return 5/6 when add 1/3 to 1/2 by add method")
    public void it_should_return_56_when_add_13_to_12_by_add_method(){
        //GIVEN
        Fraction fraction1 = new Fraction(1,2);
        Fraction fraction2 = new Fraction(1,3);

        //WHEN
        Fraction fractionResult = fractionService.add(fraction1, fraction2);

        //THEN
        Assertions.assertEquals("5/6", fractionResult.getFractionFormat());
    }

    @Test
    @DisplayName("it should return 3/4 when add 1/4 to 1/2 by add method")
    public void it_should_return_34_when_add_14_to_12_by_add_method(){
        //GIVEN
        Fraction fraction1 = new Fraction(1,2);
        Fraction fraction2 = new Fraction(1,4);

        //WHEN
        Fraction fractionResult = fractionService.add(fraction1, fraction2);

        //THEN
        Assertions.assertEquals("3/4", fractionResult.getFractionFormat());
    }

}
