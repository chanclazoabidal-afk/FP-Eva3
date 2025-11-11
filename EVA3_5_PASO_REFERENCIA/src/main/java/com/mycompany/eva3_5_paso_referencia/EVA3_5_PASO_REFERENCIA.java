/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_paso_referencia;


/**
 *
 * @author Erick
 */
public class EVA3_5_PASO_REFERENCIA {

   
     public static void main(String[] args) {
        int valor[] = new int[1];
        System.out.println("Valor (antes): " + valor[0]);
        incrementar(valor);
        System.out.println("Valor (después): " + valor[0]);
    }

    public static void incrementar(int[] val) {
        for (int i = 0; i < val.length; i++) {
            val[i] = val[i] + 1;
        }
    }
}