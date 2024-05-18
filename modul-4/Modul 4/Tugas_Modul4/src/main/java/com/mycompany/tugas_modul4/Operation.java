package com.mycompany.tugas_modul4;

/**
 *
 * @author MSI GAMING
 */
public abstract class Operation {
    protected double bilanganA;
    protected double bilanganB;

    public void setBilanganA(double bilanganA) {
        this.bilanganA = bilanganA;
    }

    public void setBilanganB(double bilanganB) {
        this.bilanganB = bilanganB;
    }

    public abstract double calculate();
}

