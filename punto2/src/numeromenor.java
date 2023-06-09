import java.util.Scanner;

public class numeromenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un primer numero");
        int numer1 = scanner.nextInt();
        System.out.println("Ingrese un segundo numero");
        int numer2 = scanner.nextInt();

        if(numer1<numer2){
            System.out.println("El numero menor es :"+numer1);
        } else if (numer2<numer1) {
            System.out.println("El numero menor es :"+numer2);
        }else if (numer1==numer2){
            System.out.println("Ambos numeros son iguales");
        }
    }
    }

