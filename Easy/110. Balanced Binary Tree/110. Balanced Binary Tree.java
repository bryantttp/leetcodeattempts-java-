// 161224 Submission
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
    // Approach
    // 1) Similar to diameter of a Binary Tree, but calculate difference to check if it is height-balanced
    // 2) Create recursive method to check the left and right height and capture the max difference using a global variable
    int difference = 0;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        if (difference > 1){
            return false;
        }
        else{
            return true;
        }
    }
    public int dfs(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftCount = dfs(node.left);
        int rightCount = dfs(node.right);
        difference = Math.max(difference, Math.abs(leftCount-rightCount));
        return 1 + Math.max(leftCount,rightCount);
    }

    // Runtime: 0ms, beats 100% of users
    // Memory: 44.29MB, beats 67.89% of users
}
