package Sort;

public class Merge {
    public static void main(String[] args) {
        int[] array = {64, 25, 45, 2, 64, 43, 12, 22, 11};

        mergeSort(array, 0, array.length - 1);

        System.out.println("Arreglo ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Arrays temporales para la fusión
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copia los datos a los arrays temporales
        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, middle + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copia los elementos restantes de leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copia los elementos restantes de rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
