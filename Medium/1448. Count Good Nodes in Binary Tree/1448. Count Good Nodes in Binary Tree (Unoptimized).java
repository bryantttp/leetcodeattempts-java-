// 191224 Submission
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
    int noOfGoodNodes = 1;
    public int goodNodes(TreeNode root) {
        // Approach
        // 1) Instantiate a global variable to count no. of good nodes
        // 2) Use recursive method to do dfs, accept a TreeNode and int parameter, to store the greatest value
        // 3) In the method, check if the value is larger or equal to the greatest value, if so, add 1 to the global variable count
        // 4) Return the global variable count
        dfs(root, root.val);
        return noOfGoodNodes;
    }
    public void dfs(TreeNode node, int greatestVal){
        if (node == null){
            return;
        }
        if (node.left != null){
            if (node.left.val < greatestVal){
                dfs(node.left,greatestVal);
            }
            else{
                noOfGoodNodes += 1;
                dfs(node.left, node.left.val);
            }
        }
        if (node.right != null){
            if (node.right.val < greatestVal){
                dfs(node.right,greatestVal);
            }
            else{
                noOfGoodNodes += 1;
                dfs(node.right, node.right.val);
            }
        }
        return;
    }
    // Runtime = 212 ms, beats 5.60% of users
    // Memory = 52.27MB, beats 61.28% of users
}
