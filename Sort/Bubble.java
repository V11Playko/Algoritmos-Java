package Sort;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {64, 34, 11, 3, 5, 86, 25, 12, 22, 11, 90};

        bubbleSort(array);

        System.out.println("Arreglo ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
