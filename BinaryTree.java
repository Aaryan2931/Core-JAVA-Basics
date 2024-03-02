//
//
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int item) {
//        data = item;
//        left = right = null;
//    }
//}
//
//class BinaryTree {
//    Node root;
//
//    int findSmallestElement(Node node) {
//        if (node == null)
//            return Integer.MAX_VALUE;
//
//        int currentData = node.data;
//        int leftData = findSmallestElement(node.left);
//        int rightData = findSmallestElement(node.right);
//
//        return Math.min(currentData, Math.min(leftData, rightData));
//    }
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(4);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(6);
//        tree.root.left.left = new Node(1);
//        tree.root.left.right = new Node(3);
//        tree.root.right.left = new Node(5);
//        tree.root.right.right = new Node(7);
//
//        int smallestElement = tree.findSmallestElement(tree.root);
//        System.out.println("Smallest element in the tree: " + smallestElement);
//    }
//}