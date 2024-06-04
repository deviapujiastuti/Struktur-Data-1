package pekan7;

public class TreeMain {

	public static void main(String[] args) {
		BTree tree = new BTree();
		System.out.print("Jumlah simpul pohon: ");
		System.out.println(tree.countNodes());
		Node root = new Node(1);
		tree.setRoot(root);
		System.out.print("Jumlah simpul jika hanya ada root: ");
		System.out.println(tree.countNodes());
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		root.setLeft(node2);
		node2.setLeft(node4);
		node2.setRight(node5);
		node5.setLeft(node7);
		root.setRight(node3);
		node3.setRight(node6);
		tree.setCurrent(tree.getRoot());
		System.out.print("menampilkan simpul terakhir: ");
		System.out.println(tree.getCurrent().getData());
		System.out.print("Jumlah simpul setelah simpul 7 ditambahkan: ");
		System.out.println(tree.countNodes());
		System.out.print("InOrder: ");
		tree.printInorder();
		System.out.print("\nPreorder: ");
		tree.printPreorder();
		System.out.print("\nPostorder: ");
		tree.printPostorder();
		System.out.println("\nMenampilkan simpul dalam bentuk pohon: ");
		tree.print();
	}

}
