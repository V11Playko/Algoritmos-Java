package Math;

import java.util.Arrays;
import java.util.Scanner;

public class AverageMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int quantityNumbers = sc.nextInt();

        if (quantityNumbers <= 0) {
            System.out.println("La cantidad de números debe ser mayor que cero.");
            return;
        }

        double[] numbers = new double[quantityNumbers];

        for (int i = 0; i < quantityNumbers; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        Arrays.sort(numbers); // Ordenamos los números para calcular la mediana.

        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        double promedio = sum / quantityNumbers;

        double mediana;

        if (quantityNumbers % 2 == 0) {
            // Si hay un número par de elementos, tomamos el promedio de los dos números del medio.
            int medio1 = quantityNumbers / 2 - 1;
            int medio2 = quantityNumbers / 2;
            mediana = (numbers[medio1] + numbers[medio2]) / 2;
        } else {
            // Si hay un número impar de elementos, tomamos el número del medio.
            int medio = quantityNumbers / 2;
            mediana = numbers[medio];
        }

        System.out.println("El promedio de los números ingresados es: " + promedio);
        System.out.println("La mediana de los números ingresados es: " + mediana);

        sc.close();
    }
}
