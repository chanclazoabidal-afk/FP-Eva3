/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_paso_referencia;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class EVA3_7_PASO_REFERENCIA {

    public static void main(String[] args) {

        String[] cliente = new String[5];
        double[] credito = new double[5];

        capturarCliente(cliente, credito);

        int opcion;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Imprimir lista de clientes");
            System.out.println("2. Mostrar total de créditos");
            System.out.println("3. Mostrar promedio de créditos");
            System.out.println("4. Cliente con mayor crédito");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            
            // ←← IMPORTANTE: limpiar buffer para evitar errores
            opcion = input.nextInt();
            input.nextLine(); 

            switch (opcion) {
                case 1:
                    imprimir(cliente, credito);
                    break;
                case 2:
                    System.out.println("Total de créditos: $" + totalCreditos(credito));
                    break;
                case 3:
                    System.out.println("Promedio de créditos: $" + promedioCreditos(credito));
                    break;
                case 4:
                    System.out.println("Cliente con mayor crédito: " 
                        + mayorCredito(cliente, credito));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public static void capturarCliente(String[] nombre, double[] credito) {
        Scanner captu = new Scanner(System.in);

        System.out.println("=== CAPTURA DE CLIENTES ===");
        for (int i = 0; i < credito.length; i++) {

            System.out.print("Nombre del cliente " + (i + 1) + ": ");
            nombre[i] = captu.nextLine();

            System.out.print("Crédito del cliente " + (i + 1) + ": ");
            credito[i] = captu.nextDouble();
            captu.nextLine(); // limpiar buffer
        }
    }

    public static void imprimir(String[] nombre, double[] credito) {
        System.out.println("\n--- LISTA DE CLIENTES ---");
        for (int i = 0; i < credito.length; i++) {
            System.out.println("Cliente: " + nombre[i] + " | Crédito: $" + credito[i]);
        }
    }

    public static double totalCreditos(double[] credito) {
        double total = 0;
        for (double c : credito) {
            total += c;
        }
        return total;
    }

    public static double promedioCreditos(double[] credito) {
        return totalCreditos(credito) / credito.length;
    }

    public static String mayorCredito(String[] nombre, double[] credito) {
        int posMayor = 0;

        for (int i = 1; i < credito.length; i++) {
            if (credito[i] > credito[posMayor]) {
                posMayor = i;
            }
        }

        return nombre[posMayor] + " ($" + credito[posMayor] + ")";
    }
}