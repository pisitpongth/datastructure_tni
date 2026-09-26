
public class TestApp {

	public static void main(String[] args) {

		int[] array1 = { 11, 9, 23, 87, 38, 22, 92, 10 };
		Sorting sort1 = new Sorting(array1);
		System.out.print("Bubble Sort: ");
		sort1.bubbleSort();
		sort1.printSortedData();

		int[] array2 = { 25, 11, 45, 6, 87, 20, 78, 64 };
		Sorting sort2 = new Sorting(array2);
		System.out.print("\nSelection Sort: ");
		sort2.selectionSort();
		sort2.printSortedData();

		int[] array3 = { 68, 10, 87, 75, 14, 36, 98, 76 };
		Sorting sort3 = new Sorting(array3);
		System.out.print("\nInsertion Sort: ");
		sort3.insertionSort();
		sort3.printSortedData();

		int[] array4 = { 87, 11, 26, 35, 49, 85, 21, 46 };
		Sorting sort4 = new Sorting(array4);
		System.out.print("\nQuick Sort: ");
		sort4.quickSort();
		sort4.printSortedData();
	}

}
