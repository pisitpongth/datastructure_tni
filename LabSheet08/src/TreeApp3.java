
public class TreeApp3 {

	public static void main(String[] args) {

		System.out.println("------------------------------");
		System.out.println("Binary Tree from createTree5()");
		System.out.println("------------------------------");
		BinaryTree tree5 = new BinaryTree();
		tree5.createTree5();
		tree5.printTree(tree5.getRoot(), 0);

		System.out.println("\nDelete Method Test: Leaf Node");
		tree5.delete(25);
		tree5.printTree(tree5.getRoot(), 0);

		System.out.println("\nDelete Method Test: Delete Node with 1 child");
		tree5.delete(10);
		tree5.printTree(tree5.getRoot(), 0);

		System.out.println("\nDelete Method Test: Delete Node with 2 child");
		tree5.delete(60);
		tree5.printTree(tree5.getRoot(), 0);

	}

}
