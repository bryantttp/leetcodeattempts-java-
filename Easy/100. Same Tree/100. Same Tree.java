// 171224 Submission
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
    // 1) Similar to diameter of binary tree, but instead, use a global boolean variable for answer
    // 2) Recursive method to check the values of both treenodes' left and right values
    boolean isSameTreeVal = true;
    boolean breakOutOfDfs = false;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        dfs(p,q);
        return isSameTreeVal;
    }
    public void dfs(TreeNode node1, TreeNode node2){
        while (!breakOutOfDfs){
            if (node1 == null && node2 == null){
                return;
            }
            if ((node1 == null && node2 != null)|| (node1 != null && node2 == null) || (node1.val != node2.val)){
                breakOutOfDfs = true;
                isSameTreeVal = false;
                return;
            }
            dfs(node1.left,node2.left);
            dfs(node1.right,node2.right);
            return;
        }
    }
    // Runtime = 0ms, beats 100% of users
    // Memory = 41.02MB, beats 50.80% of users
}
