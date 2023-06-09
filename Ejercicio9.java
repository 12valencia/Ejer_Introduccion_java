import java.util.Scanner;

public class Ejercicio9 {

    /*Una fabrica tiene una promocion de descuento para vender un numero de sillas, si son mas de 5%
    * sillas el descuento es de 10%, si son mas de 12 sillas el descuento es de 20%, si son mas de 40
    * sillas el descuento es de 30%, imprimir el valor a pagar aplicando el descuento correspondiente
    * dado el numero de unidades que compre un usuario, el precio unitario sin descuento es de $40.000*/

    public static void main(String[] args) {

        System.out.println("Promocion \n");

        System.out.println("Precio unitario de las sillas");
        System.out.println("$40.000\n");

        int silla = 40000;
        double desc = 0;
        double total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de sillas a comprar: ");
        int venta = sc.nextInt();

        double ventaSilla = venta * silla;

        if (venta < 5) {

            System.out.println("No tiene descuento\n");
            desc = 0;

        } else if (venta >= 5 && venta < 12) {

            System.out.println("Usted tiene un descuento del 10% \n");

            desc = ventaSilla * 0.1;

        } else if (venta >= 12 && venta < 40) {

            System.out.println("Tiene un descuento del 20% \n");

            desc = ventaSilla * 0.2;

        }else if (venta >= 40) {

            System.out.println("Tiene un descuento del 30% \n");

            desc = ventaSilla * 0.3;

        }

        total = ventaSilla - desc;

        System.out.println("Su compra tiene un descuento de "+desc+" y le queda en un valor de "+total);

    }

}