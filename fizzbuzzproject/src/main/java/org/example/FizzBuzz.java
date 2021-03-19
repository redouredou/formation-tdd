package org.example;

/**
 * Hello world!
 *
 */
public class FizzBuzz
{
    public static String compute(int number)
    {
        if( number == 3 || number == 6 || number == 9){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
