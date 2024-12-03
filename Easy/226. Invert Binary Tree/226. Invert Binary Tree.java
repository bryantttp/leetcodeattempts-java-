// 031224 Submission
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Approach
        // 1) Recursive method to swap left and right side of root node
        // 2) Instantiate 2 treenodes to store left and right side then swap the pointers from root node to the respective nodes
        // 3) if condition to check if there is a next left node and next right node to continue invertTree recursion

        if (root == null || root.left == null && root.right == null){
            return root;
        }

        TreeNode currentTreeNode = root;
        TreeNode tempLeftTreeNode = root.left;
        TreeNode tempRightTreeNode = root.right;
        currentTreeNode.left = tempRightTreeNode;
        currentTreeNode.right = tempLeftTreeNode;
        if (tempLeftTreeNode != null && (tempLeftTreeNode.left != null || tempLeftTreeNode.right != null)){
            invertTree(tempLeftTreeNode);
        }
        if (tempRightTreeNode != null && (tempRightTreeNode.left != null || tempRightTreeNode.right != null)){
            invertTree(tempRightTreeNode);
        }
        return root;
    }

}
