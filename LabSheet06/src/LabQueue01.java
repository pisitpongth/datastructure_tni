import java.util.ArrayDeque;
import java.util.Deque;

public class LabQueue01 {

	public static void main(String[] args) {
		Deque<Integer> q = new ArrayDeque<Integer>();

		for (int i = 101; i <= 105; i++) {
			q.add(i);
			System.out.println("Enqueue: " + i);
		}

		System.out.println("Queue => " + q);

		while (!q.isEmpty()) {
			System.out.println("\nCalling number: " + q.peek());
			System.out.println("Providing service number: " + q.poll());
		}

		System.out.println("\nQueue => " + q);
	}

}
