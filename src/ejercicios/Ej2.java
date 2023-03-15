/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Nombre;
        System.out.println("Escribe tu nombre");
        Nombre = leer.next();
        System.out.println("Muy bien " + Nombre + " Completaste el ejercicio 2");
    }

}
