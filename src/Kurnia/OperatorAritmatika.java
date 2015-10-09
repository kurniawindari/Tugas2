/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kurnia;

/**
 *
 * @author Kurnia
 */
public class OperatorAritmatika {
    public int nilaiHasil;
    int penjumlahan(int a, int b){
        nilaiHasil = a + b;
        return nilaiHasil;
    }
    int pengurangan(int a, int b){
        nilaiHasil = a - b;
        return nilaiHasil;
    }
    int perkalian(int a, int b){
        nilaiHasil = a * b;
        return nilaiHasil;
    }

    double pembagian(double a,double b){
        double Hasil = a / b;
        return Hasil;
    }
}
