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
//    // Function to check if two trees are identical
//    boolean areIdentical(Node root1, Node root2) {
//        // Base cases: if both trees are empty, they are identical
//        if (root1 == null && root2 == null)
//            return true;
//
//        // If one of the trees is empty or the values of the current nodes differ, they are not identical
//        if (root1 == null || root2 == null || root1.data != root2.data)
//            return false;
//
//        // Recursively check the left and right subtrees
//        return areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right);
//    }
//
//    public static void main(String[] args) {
//        BinaryTree tree1 = new BinaryTree();
//        tree1.root = new Node(1);
//        tree1.root.left = new Node(2);
//        tree1.root.right = new Node(3);
//        tree1.root.left.left = new Node(4);
//        tree1.root.left.right = new Node(5);
//
//        BinaryTree tree2 = new BinaryTree();
//        tree2.root = new Node(1);
//        tree2.root.left = new Node(2);
//        tree2.root.right = new Node(3);
//        tree2.root.left.left = new Node(4);
//        tree2.root.left.right = new Node(5);
//
//        boolean identical = tree1.areIdentical(tree1.root, tree2.root);
//        if (identical) {
//            System.out.println("The two trees are identical.");
//        } else {
//            System.out.println("The two trees are not identical.");
//        }
//    }
//}
