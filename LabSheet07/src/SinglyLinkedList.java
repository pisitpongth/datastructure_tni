class Node {
	public int data;
	public Node next;

	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public String displayList() {
		boolean first = true;
		String display = "[";
		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}
		display += "]";
		return display;
	}

	public void clear() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		if (head == null && tail == null) {
			return true;
		}
		return false;
	}

	public void append(int value) {
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
		} else {
			Node current_node = head;
			while (current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_node;
		}
	}

	public Object get(int position) {
		Node current_node = head;
		int current_index = 0;
		Object data = "No data";
		while (current_node != null) {
			if (current_index == position) {
				data = current_node.data;
				break;
			} else {
				current_index += 1;
				current_node = current_node.next;
			}
		}
		return data;
	}

	public void set(int position, int value) {
		Node current_node = head;
		int current_index = 0;
		while (current_node != null) {
			if (current_index == position) {
				current_node.data = value;
				System.out.println("Updated data success!!");
				return;
			} else {
				current_index += 1;
				current_node = current_node.next;
			}
		}
		System.out.println("Updated data fail...");
	}

	public boolean contains(int value) {
		Node current_node = head;
		while (current_node != null) {
			if (current_node.data == value) {
				return true;
			} else {
				current_node = current_node.next;
			}
		}
		return false;
	}

	public void addAll(SinglyLinkedList otherlist) {
		Node temp_node = otherlist.head;
		while (temp_node != null) {
			this.append(temp_node.data);
			temp_node = temp_node.next;
		}
	}
}
