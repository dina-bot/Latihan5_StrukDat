package modul.pkg5;

public class Main {

    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();

        pohon.newNode(20);
        pohon.newNode(2);
        pohon.newNode(25);
        pohon.newNode(37);
        pohon.newNode(16);

        System.out.print("\nPre Order\t: ");
        pohon.preOrder(pohon.root);
        System.out.print("\nIn Order\t: ");
        pohon.inOrder(pohon.root);
        System.out.print("\nPost Order\t: ");
        pohon.postOrder(pohon.root);
    }

}
