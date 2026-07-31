import java.util.Stack;

public class LabStack02 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 1; i < array.length + 1; i++) {
			stack.push(i);
			System.out.println("Push in track : " + i);
		}
		System.out.println("Train car after into dead-end track : " + stack);

		System.out.println();

		for (int i = 1; i < array.length + 1; i++) {
			System.out.println("Pop from track : " + stack.pop());
		}
		System.out.println("Train car after out of dead-end track : " + stack);
	}

}
