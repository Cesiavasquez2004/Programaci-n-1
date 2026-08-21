/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorunidades;
import java.util.Scanner;
/**
 *
 * @author default
 */
public class ConversorUnidades {

    /**
     * 2. Conversor de Unidades Físicas (Uso Do-while)
Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
4) Salir.
• Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
error y volver a pedir el dato.
• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
el usuario elija la opción 4.
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);

        int opcion;
        double cantidad;
        double resultado;

        do {

            System.out.println("\n--- CONVERSOR DE UNIDADES ---");
            System.out.println("1. Metros a Pies");
            System.out.println("2. Kilogramos a Libras");
            System.out.println("3. Centimetros a Pulgadas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 3) {

                System.out.print("Ingrese la cantidad a convertir: ");
                cantidad = entrada.nextDouble();

                while (cantidad <= 0) {
                    System.out.println("Error: la cantidad debe ser mayor que cero.");
                    System.out.print("Ingrese la cantidad nuevamente: ");
                    cantidad = entrada.nextDouble();
                }

                switch (opcion) {

                    case 1:
                        resultado = cantidad * 3.28084;
                        System.out.println("Resultado: " + resultado + " pies");
                        break;

                    case 2:
                        resultado = cantidad * 2.20462;
                        System.out.println("Resultado: " + resultado + " libras");
                        break;

                    case 3:
                        resultado = cantidad / 2.54;
                        System.out.println("Resultado: " + resultado + " pulgadas");
                        break;
                }

            } else if (opcion == 4) {
                System.out.println("Programa finalizado.");

            } else {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}
 