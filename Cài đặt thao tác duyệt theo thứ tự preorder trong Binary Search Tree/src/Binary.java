public class Binary {
    private TreeNode root;

    static class TreeNode {
        String data;
        TreeNode left, right;

        TreeNode(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static class Main {
        public static void main(String[] args) throws Exception {
            Binary bt = new Binary();
            Binary.TreeNode root = new Binary.TreeNode("A");
            bt.root = root;
            bt.root.left = new Binary.TreeNode("B");
            bt.root.left.left = new Binary.TreeNode("C");
            bt.root.left.right = new Binary.TreeNode("D");
            bt.root.right = new Binary.TreeNode("E");
            bt.root.right.right = new Binary.TreeNode("F");
            System.out.println(bt);
        }

    }
}
