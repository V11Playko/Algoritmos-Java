package Sort;

public class Selection {
    public static void main(String[] args) {
        int[] array = {8, 23, 75, 43, 64, 25, 12, 22, 11};

        selectionSort(array);

        System.out.println("Arreglo ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // intercambiar el elemento mínimo encontrado con el primer elemento
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
