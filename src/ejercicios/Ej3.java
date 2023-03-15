/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Frase;
        System.out.println("ingrese una frase");
        Frase = leer.nextLine();
        System.out.println("la frase en mayusculas es: " + Frase.toUpperCase());
        System.out.println("la frase en minusculas es: " + Frase.toLowerCase());
    }

}
