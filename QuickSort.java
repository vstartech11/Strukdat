public class QuickSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
			printArray(arr, arr.length);
		}

		System.out.println("Pivot: " + pivot + " = ");
		printArray(arr, arr.length);
		// System.out.println(Arrays.toString(arr).replace("[","").replace("]",""));
		swap(arr, i + 1, high);
		return (i + 1);
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
			// printArray(arr, arr.length);
		}
	}

	public static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++)
        if (i == arr.length - 1) {
            System.out.print(arr[i] + "\n");
        } else {
            System.out.print(arr[i] + ", ");
        }
	}

	public static void main(String[] args) {
		int[] arr = {7,3,8,6,1,5,2,4};
		int sort = arr.length;
		System.out.println("Data sebelum di sorting");
		printArray(arr, sort);
		System.out.println("\nProses Quicksort");
		quickSort(arr, 0, sort - 1);
		System.out.println("Setelah disorting");
		printArray(arr, sort);
	}
}