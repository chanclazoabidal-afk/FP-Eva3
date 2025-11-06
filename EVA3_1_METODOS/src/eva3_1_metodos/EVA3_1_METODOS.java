/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Erick
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1 = 5, val2 = 10;
        // 1. Si necesito guardar el valor de retorno
        int resu = sumarEnteros(val1, val2); // invocar método
        System.out.println("Suma de 5 más 10 es = " + resu);
        
        // 2. No necesito guardar el valor, un solo uso
        System.out.println("Suma de 5 más 10 es = " + sumarEnteros(val1, val2));
    }
    
    // METODO PARA SUMAR DOS ENTEROS 
    // LLAMAR A SUS METODOS USANDO VERBOS Y ESCRITURAS CAMELCASE
    // MODIFICADORES DE ACCESO: PUBLIC, PROTECTED, PRIVATE DEFINIET
    // 2. STATIC --> PARA USAR LOS METODOS DENTRO DEL MAIN
    // 3. VALOR DE RETORNO: CUALQUIER TIPO DE DATO
    // VOID: SI NO QUIERES REGRESAR UN VALOR
    // 4. NOMBRE DEL METODO: mismas reglas que los identificadores
    // 5. Lista de parámetros: pueden ser cero o n cantidad
    public static int sumarEnteros(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
}
