/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero entero");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        /*int raizCuadrada = (int) Math.sqrt(num); primero lo hice asi pero,
        lo que hace esto es truncar los decimales y no nos da un resultado
        exacto la forma correcta seria la siguiente:*/
        double raizCuadrada = Math.sqrt(num);
        System.out.println("El doble de " + num + " es " + doble);
        System.out.println("El triple de " + num + " es " + triple);
        System.out.println("La raíz cuadrada de " + num + " es " + raizCuadrada);
        
    }
    
}
