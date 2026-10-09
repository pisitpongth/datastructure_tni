import java.util.ArrayList;
import java.util.Scanner;

public class JumpSearch03 {

	public static int jumpSearch(int[] nums, int target) {
		int n = nums.length;

		if (n == 0) {
			return -1;
		}

		int step = (int) Math.sqrt(n);
		int previous = 0;
		int current = step;

		while (previous < n && nums[Math.min(current, n) - 1] < target) {
			previous = current;
			current += step;

			if (previous >= n) {
				return -1;
			}
		}

		while (previous < Math.min(current, n)) {
			if (nums[previous] == target) {
				return previous;
			}

			if (nums[previous] > target) {
				return -1;
			}

			previous++;
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree();

		tree.printTree(tree.getRoot(), 0);

		ArrayList<Integer> list = tree.inorderTraversal(tree.getRoot());

		System.out.println("\nTraversal order: " + list);

		int[] nums = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}

		System.out.print("\nEnter target: ");
		int target = sc.nextInt();

		int index = jumpSearch(nums, target);

		if (index != -1) {
			System.out.println("The target (" + target + ") at index " + index);
		} else {
			System.err.println("Cannot found " + target + " in this tree");
		}

		sc.close();
	}
}