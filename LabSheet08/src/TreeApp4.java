import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {

		System.out.println("------------------------------");
		System.out.println("Binary Tree from createTree6()");
		System.out.println("------------------------------");
		BinaryTree tree6 = new BinaryTree();
		tree6.createTree6();
		tree6.printTree(tree6.getRoot(), 0);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		sc.close();

		tree6.searchDeleteNode(N);
		Node foundNode = tree6.getDeleteNode();

		if (foundNode == null) {
			System.out.println("Cannot found Node(" + N + ")");
		} else {
			if (foundNode.left != null) {
				System.out.println("Left Child Node = " + foundNode.left.data);
			} else {
				System.out.println("No Left Child");
			}
			if (foundNode.right != null) {
				System.out.println("Right Child Node = " + foundNode.right.data);
			} else {
				System.out.println("No Right Child");
			}
			if (foundNode.left == null && foundNode.right == null) {
				System.out.println(N + " is Leaf Node");
			} else {
				System.out.println(N + " is not Leaf Node");
			}
		}

	}

}
