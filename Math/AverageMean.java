package Math;

import java.util.Scanner;

public class AverageMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int quantityNumbers = sc.nextInt();

        if (quantityNumbers <= 0) {
            System.out.println("La cantidad de números debe ser mayor que cero.");
            return;
        }

        double suma = 0;

        for (int i = 1; i <= quantityNumbers; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double number = sc.nextDouble();
            suma += number;
        }

        double average = suma / quantityNumbers;

        System.out.println("El promedio de los números ingresados es: " + average);

        sc.close();
    }
}
