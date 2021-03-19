package org.example;

/**
 * Hello world!
 *
 */
public class FizzBuzz
{
    private final static String FIZZ = "Fizz" ;

    public static String compute(int number)
    {
        if(isMultipleBy3(number)){
            return FIZZ;
        }
        if(number == 5){
            return "Buzz";
        }

        return String.valueOf(number);
    }

    public static boolean isMultipleBy3(int number){
        return number % 3 == 0;
    }
}
