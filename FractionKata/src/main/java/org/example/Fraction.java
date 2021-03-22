package org.example;

public class Fraction {

    private double numerator;

    private double denominator;

    public Fraction(double numerator, double denominator){
        this.numerator = numerator;
        if(denominator != 0){
            this.denominator = denominator;
        }else{
            throw new IllegalArgumentException("Don't divide by 0");
            }
        }


    public double getNumerator(){
        return this.numerator;
    }

    public double getDenominator(){
        return this.denominator;
    }

    public double getValue(){
        return this.numerator / this.denominator;
    }
}
