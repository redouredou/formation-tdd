package org.example;

/**
 * Hello world!
 *
 */
public class FizzBuzz
{
    private final static String FIZZ = "Fizz" ;
    private final static String BUZZ = "Buzz" ;

    public static String compute(int number)
    {

        if(isMultiple(number, 3) && isMultiple(number, 5)){
            return FIZZ + BUZZ;
        }
        if(isMultiple(number, 3)){
            return FIZZ;
        }
        if(isMultiple(number, 5)){
            return BUZZ;
        }

        return String.valueOf(number);
    }

    public static boolean isMultiple(int number, int multiple){
        return number % multiple == 0;
    }
}
