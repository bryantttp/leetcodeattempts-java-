// 091224 Submission

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
    public int maxDepth(TreeNode root) {
        // Approach
        // 1) Instantiate a int variable to store the max depth
        // 2) Create a method that returns the max depth based on the node and the existing max depth
        // 3) Call the method recursively to check all available nodes and their depth
        if(root == null){
            return 0;
        }
        // This enables us to automatically increment for each child node that we enter, solving 1 & 2, and since it calls the same method, it uses 3 as well
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right)); 
    }

    // Runtime = 0ms, beats 100% of users
    // Memory = 42.92MB, beats 13.71% of users
}
