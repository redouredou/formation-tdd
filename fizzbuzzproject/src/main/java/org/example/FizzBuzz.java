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

        StringBuilder result = new StringBuilder();

        if(isMultiple(number, 3)){
            result.append(FIZZ);
        }
        if(isMultiple(number, 5)){
            result.append(BUZZ);
        }
        if(result.length() == 0){
            result.append(number);
        }

        return result.toString();
    }

    public static boolean isMultiple(int number, int multiple){
        return number % multiple == 0;
    }
}
