// 241224 Submission (Assisted from Neetcode.io)

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
    public boolean isValidBST(TreeNode root) {
        // Approach
        // 1) Create recursive method to return boolean value
        // 2) In the method, set a base case to end the recursion when the dfs reaches the end
        // 3) Check to ensure that the node's value is within a set range, depending on whether it was dfs on a left or right node
        // 4) Return the dfs again but for the left and right nodes of the original node
        
        // Long used instead of int due to limits of int
        // Will return false if -2^31 or 2^31-1 is used, since they are the same value as int max value/min value
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
   
    public boolean dfs(TreeNode node, long left, long right) {
        if (node == null) {
            return true;
        }
        if (!(left < node.val && node.val < right)) {
            return false;
        }
        return dfs(node.left, left, node.val) && dfs(node.right, node.val, right);
    }
    // Runtime = 0ms, beats 100% of users
    // Memory = 43.24MB, beats 71.20% of users
}

