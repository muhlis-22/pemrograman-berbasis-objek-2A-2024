package com.mycompany.main;

/**
 *
 * @author MSI GAMING
 */
public class Perkalian extends Operation {
    @Override
    public double calculate() {
        return bilangan1 * bilangan2;
    }

    @Override
    public double calculate(double bilangan1, double bilangan2) {
        return bilangan1 * bilangan2 * bilangan3;
    }
}