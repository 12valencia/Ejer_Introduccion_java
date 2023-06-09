import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una nota");
        int nota = sc.nextInt();

        switch (nota) {

            case 1:
                System.out.println("Aceptable");
                break;

            case 2:
                System.out.println("Bueno");
                break;

            case 3:
                System.out.println("Completo");
                break;

            case 4:
                System.out.println("Deficiente");
                break;

            case 5:
                System.out.println("Excelente");
                break;

            case 6:
                System.out.println("Falto");
                break;

            default:
                System.out.println("No existe esta opcion");
                break;

        }

    }

}