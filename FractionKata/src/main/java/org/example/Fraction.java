package org.example;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator != 0){
            this.denominator = denominator;
        }else{
            throw new IllegalArgumentException("Don't divide by 0");
            }
        }


    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public double getValue() {
        return (double)this.numerator / this.denominator;
    }

    public String getFractionFormat() {
        return this.numerator + "/" + this.denominator;
    }


}
