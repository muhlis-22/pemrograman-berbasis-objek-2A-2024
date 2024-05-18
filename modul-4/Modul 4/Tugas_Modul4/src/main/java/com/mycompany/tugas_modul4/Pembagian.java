/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_modul4;

/**
 *
 * @author MSI GAMING
 */
public class Pembagian extends Operation {
    @Override
    public double calculate() {
        if (bilanganB != 0) {
            return bilanganA / bilanganB;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan!");
            return Double.NaN;
        }
    }
}