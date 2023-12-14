package Searching;

public class Linear {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        int target = 11;

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado en la lista");
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Se encontró el elemento, devuelve la posición
            }
        }
        return -1; // El elemento no está en la lista
    }
}
