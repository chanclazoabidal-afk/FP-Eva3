/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_modificar_arreglos;

/**
 *
 * @author Erick
 */
public class EVA3_6_MODIFICAR_ARREGLOS {

    public static void main(String[] args) {
        int arreglo1[] = new int[10];
        int arreglo2[] = new int[20];

        llenarArreglo(arreglo1);
        imprimirArreglo(arreglo1);

        llenarArreglo(arreglo2);
        imprimirArreglo(arreglo2);
    }

    public static void llenarArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimirArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}