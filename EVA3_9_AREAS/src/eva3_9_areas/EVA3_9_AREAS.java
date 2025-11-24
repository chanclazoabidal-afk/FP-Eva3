package eva3_9_areas;

import java.util.Scanner;

public class EVA3_9_AREAS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Un solo Scanner
        int opcion;

        do {
            System.out.println("******************************");
            System.out.println("          MENÚ");
            System.out.println("1. Área del círculo");
            System.out.println("2. Área del cuadrado");
            System.out.println("3. Área del triángulo");
            System.out.println("4. Salir");
            System.out.println("******************************");
            System.out.print("Selecciona una opción: ");

            // Validar que el input sea un número
            while (!input.hasNextInt()) {
                System.out.print("Por favor ingresa un número válido: ");
                input.next();
            }
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    areaCirculo(input);
                    break;
                case 2:
                    areaCuadrado(input);
                    break;
                case 3:
                    areaTriangulo(input);
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);

        input.close(); // Cerrar el Scanner
    }

    // Área del círculo
    public static void areaCirculo(Scanner input) {
        System.out.print("Ingresa el radio del círculo: ");
        while (!input.hasNextDouble()) {  // Validar número
            System.out.print("Ingresa un número válido: ");
            input.next();
        }
        double radio = input.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    // Área del cuadrado
    public static void areaCuadrado(Scanner input) {
        System.out.print("Ingresa el lado del cuadrado: ");
        while (!input.hasNextDouble()) {  // Validar número
            System.out.print("Ingresa un número válido: ");
            input.next();
        }
        double lado = input.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    // Área del triángulo
    public static void areaTriangulo(Scanner input) {
        System.out.print("Ingresa la base del triángulo: ");
        while (!input.hasNextDouble()) {
            System.out.print("Ingresa un número válido: ");
            input.next();
        }
        double base = input.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        while (!input.hasNextDouble()) {
            System.out.print("Ingresa un número válido: ");
            input.next();
        }
        double altura = input.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}
