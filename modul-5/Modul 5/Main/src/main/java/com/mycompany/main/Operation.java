package com.mycompany.main;

/**
 *
 * @author MSI GAMING
 */
public abstract class Operation {
    protected double bilangan1;
    protected double bilangan2;
    protected double bilangan3;

    public abstract double calculate();

    // Overloading metode calculate
    public double calculate(double bilangan1, double bilangan2) {
        return calculate(calculate(bilangan1, bilangan2), bilangan3);
    }
    
    public double getBilangan1() {
        return bilangan1;
    }
    
    public void setBilangan1(double bilangan1) {
        this.bilangan1 = bilangan1;
    }

    public double getBilangan2() {
        return bilangan2;
    }

    public void setBilangan2(double bilangan2) {
        this.bilangan2 = bilangan2;
    }

    public double getBilangan3() {
        return bilangan3;
    }

    public void setBilangan3(double bilangan3) {
        this.bilangan3 = bilangan3;
    }
}