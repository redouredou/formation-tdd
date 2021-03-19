package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.example.FizzBuzz;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void should_return_1_for_1()
    {
        //GIVEN
        int number = 1;

        //WHEN
        String result = FizzBuzz.compute(number);

        //THEN
        Assertions.assertEquals("1", result);
    }

    @Test
    public void should_return_2_for_2()
    {
        //GIVEN
        int number = 2;

        //WHEN
        String result = FizzBuzz.compute(number);

        //THEN
        Assertions.assertEquals("2", result);
    }

    @Test
    public void should_return_4_for_4()
    {
        //GIVEN
        int number = 4;

        //WHEN
        String result = FizzBuzz.compute(number);

        //THEN
        Assertions.assertEquals("4", result);
    }

    @Test
    public void should_return_Fizz_for_3()
    {
        //GIVEN
        int number = 3;

        //WHEN
        String result = FizzBuzz.compute(number);

        //THEN
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_for_6()
    {
        //GIVEN
        int number = 6;

        //WHEN
        String result = FizzBuzz.compute(number);

        //THEN
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_for_9()
    {
        //GIVEN
        int number = 9;

        //WHEN
        String result = FizzBuzz.compute(number);

        //THEN
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_for_5()
    {
        //GIVEN
        int number = 5;

        //WHEN
        String result = FizzBuzz.compute(number);

        //THEN
        Assertions.assertEquals("Buzz", result);
    }
}
