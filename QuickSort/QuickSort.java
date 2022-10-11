import java.util.*;

class Main {
	static int partition(int numArray[], int low, int high) {
		int pivot = numArray[high];
		int i = (low - 1);
		System.out.println(Arrays.toString(numArray) + "Pivot = " + pivot);
		for (int j = low; j <= high - 1; j++) {
			if (numArray[j] <= pivot) {
				i++;
				int temp = numArray[i];
				numArray[i] = numArray[j];
				numArray[j] = temp;
				// System.out.println(Arrays.toString(numArray));
			}
		}
		System.out.println(Arrays.toString(numArray));
		int temp = numArray[i + 1];
		numArray[i + 1] = numArray[high];
		numArray[high] = temp;
		return i + 1;
	}

	static void quickSort(int numArray[], int low, int high) {
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
		System.out.println("Original Array:" + Arrays.toString(numArray));
		quickSort(numArray, 0, n - 1);
		System.out.println("\nSorted Array:" + Arrays.toString(numArray));
	}
}