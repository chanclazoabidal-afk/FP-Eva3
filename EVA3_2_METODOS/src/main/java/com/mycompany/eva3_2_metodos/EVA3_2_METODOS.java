/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_metodos;
import java.util.Scanner;
/**
 *
 * @author Erick
 */

    
        

public class EVA3_2_METODOS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mensaje;
        int valor;

        System.out.println("Captura el mensaje:");
        mensaje = input.nextLine();

        System.out.println("¿Cuántas repeticiones?");
        valor = input.nextInt();

        imprimirMensaje(mensaje, valor);
    }

    public static void imprimirMensaje(String mensaje, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(mensaje);
        }
    }
}