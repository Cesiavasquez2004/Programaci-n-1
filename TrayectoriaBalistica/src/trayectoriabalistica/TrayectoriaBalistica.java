/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trayectoriabalistica;
import java.util.Scanner;
/**
 *
 * @author default
 */
public class TrayectoriaBalistica {

    /**
     * 3. Simulación de Trayectoria Balística (Uso estricto de for)
Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
correspondiente a la trayectoria.
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
entre 1 y 89 grados.
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
segundo 𝑡 = 10.
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        double velocidad;
        double angulo;
        double altura;
        double tiempo;

        System.out.print("Ingrese la velocidad inicial: ");
        velocidad = entrada.nextDouble();

        System.out.print("Ingrese el angulo de lanzamiento: ");
        angulo = entrada.nextDouble();

        System.out.print("Ingrese el tiempo de simulacion: ");
        tiempo = entrada.nextDouble();

        for (double t = 0; t <= tiempo; t = t + 0.5) {

            altura = velocidad * Math.sin(Math.toRadians(angulo)) * t
                    - (9.81 * t * t) / 2;

            if (altura < 0) {
                altura = 0;
            }

            System.out.println("Tiempo: " + t + " s - Altura: " + altura + " m");
        }

        entrada.close();
    }
}