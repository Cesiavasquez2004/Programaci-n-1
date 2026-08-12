/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprobaciondemateria;

/**
 *
 * @Cesia Vasquez
 */
import java.util.Scanner;
public class Sistemadeaprobaciondemateria {

    /**
     * Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".
Requisito estricto: Solo puedes usar una estructura if/else simple.
     */
    public static void main(String[] args) {
        {
          Scanner entrada = new Scanner(System.in);

        String nombre;
        double Cesia;
        double Vanessa;
        double promedio;

        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese la nota del primer examen: ");
        Cesia = entrada.nextDouble();

        System.out.print("Ingrese la nota del segundo examen: ");

        Vanessa = entrada.nextDouble();

        promedio = (Cesia + Vanessa) / 2;

        if (promedio >= 65) {

            System.out.println("Estudiante: " + nombre);

            System.out.println("Promedio: " + promedio);

            System.out.println("Aprobado");

        } else {

            System.out.println("Estudiante: " + nombre);

            System.out.println("Promedio: " + promedio);

            System.out.println("Reprobado");

        }
        }
        
        
    }
}
    

