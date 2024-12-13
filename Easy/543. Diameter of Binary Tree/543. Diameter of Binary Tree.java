// 131224 Submission
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
    // Approach (Adapted from Neetcode's Video + LeetCode Solutions)
    // 1) Instantiate global variable to calculate diameter
    // 2) Recursive method to track each node's left and right count, check for largest diameter against global variable
    // 3) return global variable

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    public int dfs(TreeNode node){
        // Breaks the recursion once no node is found
        if (node == null){
            return 0;
        }
        // Checks all possible left nodes
        int leftCount = dfs(node.left);
        // Checks all possible right nodes
        int rightCount = dfs(node.right);
        diameter = Math.max(diameter, leftCount + rightCount);
        // This returns to the previous node, increment of 1 to note that current node is not null
        return 1 + Math.max(leftCount,rightCount);
    }
    // Runtime = 0ms, beats 100% of users
    // Memory = 44.74MB, beats 54.22% of users
}
