package bst2;

public class Driver {

	/* Write a driver class with a main() that adds some values 
	 * to the BST and then uses the showAll() to print out the 
	 * values from the tree, and calls the inorder() method.*/
	
	public static void main(String[] args) {
		genericNode <Integer>tree = new genericNode<>();
		tree.add(24);
		tree.add(99);
		tree.add(12);
		tree.add(54);
		tree.add(100);
		tree.add(78);
		
		System.out.println("In Order traversal: ");
		tree.inOrder();
		System.out.println();
		System.out.println("Pre Order trvaersal: ");
		tree.preOrder();
		System.out.println();
		System.out.println("Post Order traversal: ");
		tree.postOrder();
		System.out.println();
		System.out.print("The size of the binary search tree is: " + tree.size());
		
		
		System.out.println();
		System.out.println();
		System.out.println("After removing '24': ");
		System.out.println("In Order traversal: ");
		tree.remove(24);
		tree.inOrder();
		System.out.println();
		System.out.println("Pre Order traversal: ");
		tree.preOrder();
		System.out.println();
		System.out.println("Post Order traversal: ");
		tree.postOrder();
		System.out.println();
		System.out.println("The size of the binary serch tree is now: " + tree.size());

	}

}