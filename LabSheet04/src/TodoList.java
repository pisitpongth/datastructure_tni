
public class TodoList {

	public static void main(String[] args) {
		DoublyLinkedList todolist = new DoublyLinkedList();

		todolist.insert("Finish Homework");
		System.out.println("To-Do List = " + todolist.traversal());

		todolist.insert("Laundry");
		todolist.insert("Group Meeting");
		System.out.println("To-Do List = " + todolist.traversal());

		// Exercise no2.1
		todolist.insert(0, "Submit Report");
		System.out.println("To-Do List = " + todolist.traversal());

		// Exercise no2.2
		todolist.insert(2, "Buy Food");
		System.out.println("To-Do List = " + todolist.traversal());

		// Exercise no2.3
		todolist.insert("Go to Gym");
		System.out.println("To-Do List = " + todolist.traversal());

		// Exercise no4.1
		todolist.remove();
		System.out.println("To-Do List = " + todolist.traversal());

		// Exercise no4.2
		todolist.remove(3);
		System.out.println("To-Do List = " + todolist.traversal());

		// Exercise no4.3
		todolist.remove(0);
		System.out.println("To-Do List = " + todolist.traversal());

		System.out.println("\nBackward Traversal = " + todolist.backwardTraversal());
	}

}
