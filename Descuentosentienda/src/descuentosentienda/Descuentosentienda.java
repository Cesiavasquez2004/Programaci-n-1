/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentosentienda;
import java.util.Scanner;
/**
 *
 * @Cesia Vasquez
 * 
 */
public class Descuentosentienda {

    /**
     * Una tienda de software ofrece descuentos basados en la edad del cliente y si tiene una membresía
premium. Se tiene que solicitar la edad y si tiene membresía ('S' para sí, 'N' para no).
• Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
o Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. Si
cumple alguna de las condiciones, recibe un 20% de descuento. Si no, recibe un
10%.
o Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años. Si es
así, recibe un 15% de descuento. De lo contrario, no tiene descuento (0%).
El programa debe calcular y mostrar el descuento final aplicado y también el precio de venta
original y el nuevo total que se tiene que pagar por el juego.
     */
    public static void main(String[] args) {
       
    Scanner entrada = new Scanner(System.in);
     int edad;
     char membresia;
     double precio;
     double descuento;
     
     System.out.print ("Ingrese la edad:");
     edad = entrada. nextInt();
     
     System.out.print("Tiene membresia? (S/N):");
     
     membresia = entrada.next().charAt(0);
     
     System.out.print("Ingrese el precio del juego :");
     precio = entrada.nextDouble();
     
     if ( edad >= 18){
     
     if (edad > 65 || membresia == 'S'){
     descuento =   0.20;
} else {
     descuento  =  0.10;
}
}else{
    if (membresia == 'S' && edad > 12) {
        
        descuento = 0.15;

    } else{
       descuento = 0.0;
       
    }
     }
    double montoDescuento;

    double totalPagar;

        montoDescuento = precio * descuento;

        totalPagar = precio - montoDescuento;

        System.out.println("Precio original: $" + precio);

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");

        System.out.println("Monto del descuento: $" + montoDescuento);

        System.out.println("Total a pagar: $" + totalPagar);

     }
    
}

    