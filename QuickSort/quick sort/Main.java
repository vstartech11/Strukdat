import java.util.*;

public class Main {
    public static int partition(int numArray[], int low, int high) {
        int pivot = numArray[high];
        int i = (low - 1);
        System.out.println(Arrays.toString(numArray) + "-> Pivot = " + pivot);
        for (int j = low; j <= high - 1; j++) { // pivot > array?
            if (numArray[j] <= pivot) { // kondisi perbandingan untuk ditukar posisi
                i++;
                int temp = numArray[i];
                numArray[i] = numArray[j];
                numArray[j] = temp;
                // System.out.println(Arrays.toString(numArray));
            }
        }
        System.out.println(Arrays.toString(numArray));
        int temp = numArray[i + 1];
        numArray[i + 1] = numArray[high]; // 9 bkn pivot krn sudah terurut. shg pivot = 2 sbg pembanding
        numArray[high] = temp;
        return i + 1;
    }

    public static void quickSort(int numArray[], int low, int high) {
        int[] intStack = new int[high - low + 1];
        int top = -1;
        intStack[++top] = low;
        intStack[++top] = high;
        while (top >= 0) {
            high = intStack[top--];
            low = intStack[top--];
            int pivot = partition(numArray, low, high);

            if (pivot - 1 > low) {
                intStack[++top] = low;
                intStack[++top] = pivot - 1;
            }

            if (pivot + 1 < high) {
                intStack[++top] = pivot + 1;
                intStack[++top] = high;
            }
        }
    }

    public static void main(String args[]) {
        int numArray[] = { 3, 2, 6, -1, 9, -6, 1 };
        int n = 7;
        System.out.println("Array sebelum di sorting: " + Arrays.toString(numArray) + "\n");
        quickSort(numArray, 0, n - 1);
        System.out.println("\nArray setelah di sorting:" + Arrays.toString(numArray));
    }
}