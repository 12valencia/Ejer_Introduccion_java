import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numer = scanner.nextInt();

        if (numer==1000){
            System.out.println("Ganaste un premio");
        }else if (numer!=1000){
            System.out.println("sigue participando");
        }
    }
}
