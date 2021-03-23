package org.example.services;

import org.example.Utils;
import org.example.model.Fraction;

public class FractionServiceImpl implements FractionService{

    @Override
    public Fraction add(Fraction leftOperand, Fraction rightOperand) {
            int numeratorResult = (leftOperand.getNumerator() * rightOperand.getDenominator() + rightOperand.getNumerator() * leftOperand.getDenominator());
            int denominatorResult = leftOperand.getDenominator() * rightOperand.getDenominator();
            int gcd = Utils.gcd(numeratorResult, denominatorResult);
            return new Fraction(numeratorResult/gcd,denominatorResult/gcd);
    }
}
