package org.example;

public class Fraction {

    private double numerator;

    private double denominator;

    public Fraction(double numerator, double denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator(){
        return this.numerator;
    }

    public double getDenominator(){
        return this.denominator;
    }

    public double getValue(){
        return 0;
    }
}
