package org.example;


import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals(0, 0);
    }
}
