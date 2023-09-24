import java.util.Scanner;

public class Factorial {
       /* El factorial de un número es igual al producto de todos los
     números enteros positivos desde 1 hasta dicho número */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);

        sc.close();
    }
}
