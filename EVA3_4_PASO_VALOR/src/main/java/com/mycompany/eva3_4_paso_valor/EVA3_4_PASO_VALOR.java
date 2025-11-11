/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_paso_valor;

/**
 *
 * @author Erick
 */


    

public class EVA3_4_PASO_VALOR {

    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Valor (antes): " + valor);
        incrementar(valor);
        System.out.println("Valor (después): " + valor);
    }

    //Suma uno
    public static void incrementar(int val) {
        val = val + 1;
    }
}
