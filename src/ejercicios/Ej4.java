/*
 Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("CONVERSIÓN DE °C A °F");
        System.out.println("");
        System.out.println("Ingrese un valor de temperatura en Grados Centigrados(°C)");
        int grados = leer.nextInt();
        int Fahr = 32 + (9 * grados / 5);
        System.out.println("------------------------------------------------");
        System.out.println("Resultado:");
        System.out.println(grados + " °C" + " = " + Fahr + " °F");
        
    }

}