/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * Cesia Vasquez
 */
 
import java.util.Scanner;
public class Calculadora {

    /**
     * Crear un programa que actúe como una calculadora básica. Debe solicitar al usuario dos números
enteros y un carácter (char) que represente la operación a realizar:
• Suma
• Resta
• División
• Multiplicación
• Módulo ‘%.
Dependiendo del carácter ingresado, el programa debe usar una estructura de selección para
realizar la operación aritmética correspondiente y mostrar el resultado en formato decimal (cuidar
las divisiones entre cero). Si el usuario ingresa un carácter no válido, se debe mostrar "Operador
no reconocido"
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        char operador;
        int resultado;

        System.out.print("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.print("Ingrese la operacion (+, -, *, /, %): ");
        operador = entrada.next().charAt(0);

        if (operador == '+') {
            resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '-') {
            resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '*') {
            resultado = numero1 * numero2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '/') {
            resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '%') {
            resultado = numero1 % numero2;
            System.out.println("Resultado: " + resultado);

        } else {
            System.out.println("Operador no reconocido");
        }

        entrada.close();
    }
}
   
  
