package org.example;

import org.example.model.Fraction;
import org.example.services.FractionService;
import org.example.services.FractionServiceImpl;

/**
 * Hello world!
 *
 */
public class FractionKata
{

    public static void main( String[] args )
    {
        System.out.println( "Hello Fraction Kata!" );
        Fraction fraction1 = new Fraction(1,3);
        System.out.println( "First fraction :" + fraction1.getFractionFormat() + " which is decimal value is "+fraction1.getValue());
        Fraction fraction2 = new Fraction(1,4);
        System.out.println( "First fraction :" + fraction2.getFractionFormat() + " which is decimal value is "+fraction2.getValue());

        FractionService fractionService = new FractionServiceImpl();
        Fraction fractionAddition = fractionService.add(fraction1, fraction2);
        System.out.println( "The addition is :" + fractionAddition.getFractionFormat() + " which is decimal value is "+fractionAddition.getValue());

    }
}
