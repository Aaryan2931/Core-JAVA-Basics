public class IdenticalTrees {

    public static boolean areIdenticalTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        } else {
            return root1.data == root2.data &&
                    areIdenticalTrees(root1.left, root2.left) &&
                    areIdenticalTrees(root1.right, root2.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(areIdenticalTrees(root1, root2)); // true

        root2.right = new TreeNode(4);
        System.out.println(areIdenticalTrees(root1, root2)); // false
    }
}

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}