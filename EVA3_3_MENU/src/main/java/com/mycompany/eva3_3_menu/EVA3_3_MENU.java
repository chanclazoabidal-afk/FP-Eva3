/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_menu;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EVA3_3_MENU {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("******************************");
            System.out.println("          MENÚ");
            System.out.println("1. Calcular potencia");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Salir");
            System.out.println("******************************");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    calcularPotencia();
                    break;
                case 2:
                    sumarDos();
                    break;
                case 3:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }

    public static void calcularPotencia() {
        Scanner input = new Scanner(System.in);
        int base, exp, resu;

        System.out.println("******** CÁLCULO DE UNA POTENCIA ********");
        System.out.println("Captura la base:");
        base = input.nextInt();
        System.out.println("Captura el exponente:");
        exp = input.nextInt();

        System.out.println(base + " elevado a " + exp + " = " + calcularPot(base, exp));
    }

    public static int calcularPot(int base, int expo) {
        int resu = 1;
        for (int i = 1; i <= expo; i++) {
            resu = resu * base;
        }
        return resu;
    }

    public static void sumarDos() {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("******** SUMAR DOS NÚMEROS ********");
        System.out.println("Primer número:");
        num1 = input.nextInt();
        System.out.println("Segundo número:");
        num2 = input.nextInt();

        System.out.println("La suma es: " + (num1 + num2));
    }
}