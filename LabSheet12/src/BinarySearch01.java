import java.util.Scanner;

public class BinarySearch01 {

	public static void main(String[] args) {
		int[] nums = { 96, 87, 18, 6, 31, 11, 56, 36, 76 };
		nums = sorting(nums);

		for (int num : nums) {
			System.out.print(num + " ");
		}

		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a target number: ");
		int target = input.nextInt();

		int index = binarySearch(nums, target);

		if (index != -1) {
			System.out.println("The target " + target + " at index " + index);
		} else {
			System.err.println("\nCannot found " + target + " in this array");
		}
	}

	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}

	public static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (target == array[middle]) {
				return middle;
			}
			if (target < array[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -1;
	}

}