/*
1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //se crea el scanner

        //Para leer los enteros
        System.out.println("Ingrese un numero entero");
        int num1 = leer.nextInt();
        System.out.println("ingrese otro numero entero");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("la suma de " + num1 + " + " + num2 + " es = " + suma);
    }
;

}
