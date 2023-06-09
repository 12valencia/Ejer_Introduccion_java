import java.util.Scanner;
public class numeropar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if(numero % 2 ==0){
            System.out.println("El numero "+ numero + " es par");
        }else {
            System.out.println("El numero "+ numero + " es impar");
        }
    }
}
