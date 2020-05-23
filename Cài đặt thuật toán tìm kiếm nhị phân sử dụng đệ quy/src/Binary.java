import com.sun.source.tree.BinaryTree;

public class Binary{
    static Node root;
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    public Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key > key)
            return search(root.left, key);
        return search(root.right, key);
    }

    public static void main(String[] args) {
        Binary tree = new Binary();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        System.out.println(tree.search(root,1));
    }
}
