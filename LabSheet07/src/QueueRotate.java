import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {

	public static Queue<Integer> queue = new ArrayDeque<Integer>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		originalQueue();
		System.out.println();

		boolean isDone = false;
		while (!isDone) {
			System.out.print("Press 1 to rotate queue: ");
			int option = input.nextInt();

			if (option == 1) {
				System.out.println("Calling queue: " + queue.peek());
				rotateQueue();
				System.out.println("Queue => " + queue);
				System.out.println();
			} else {
				System.out.println("Exit");
				input.close();
				isDone = true;
			}
		}

	}

	public static void rotateQueue() {
		int temp = queue.poll();
		queue.add(temp);
	}

	public static void originalQueue() {
		for (int i = 101; i < 108; i++) {
			queue.add(i);
		}
		System.out.println("Queue => " + queue);
	}

}
