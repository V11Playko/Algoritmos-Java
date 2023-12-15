package Searching;

public class Binary {
    public static void main(String[] args) {
        int[] array = {11, 12, 22, 25, 64, 66, 72, 84};
        int target = 25;

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado en la lista");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Se encontró el elemento, devuelve la posición
            } else if (arr[mid] < target) {
                left = mid + 1; // Descarta la mitad izquierda
            } else {
                right = mid - 1; // Descarta la mitad derecha
            }
        }

        return -1; // El elemento no está en la lista
    }
}
