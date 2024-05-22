package com.mycompany.main;

/**
 *
 * @author MSI GAMING
 */
public class Pembagian extends Operation {
    @Override
    public double calculate() {
        if (bilangan2 != 0) {
            return bilangan1 / bilangan2;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan!");
            return Double.NaN;
        }
    }

    @Override
    public double calculate(double bilangan1, double bilangan2) {
        if (bilangan2 != 0 && bilangan3 != 0) {
            return bilangan1 / bilangan2 / bilangan3;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan!");
            return Double.NaN;
        }
    }
}