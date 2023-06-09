import java.util.Scanner;

public class Ejercicio10 {

    /*Para tributar un determinado impuesto se debe ser mayor de 16 anos y tener unos ingresos
    * iguales o superiores a $5.000.000 mensuales. Escribir un programa que pregunte al usuario
    * su edad y sus ingresos mensuales y muestre pr pantalla si el usuario tiene que tributar o no.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tributar \n");

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese sus ingresos mensuales: ");
        int ingreso = sc.nextInt();

        if (edad >= 16 && ingreso >= 5000000) {
            System.out.println("\nTiene que tributar");
        } else {
            System.out.println("\nNo tiene que tributar");
        }

    }

}