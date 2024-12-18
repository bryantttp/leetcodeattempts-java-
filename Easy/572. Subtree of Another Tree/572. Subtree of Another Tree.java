// 181224 Submission
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
    // 1) Similar to same tree question
    // 2) Instantiate global variable with boolean value to check if it is a subtree and return that value
    // 3) Run recursive method to check every possible subRoot and another to carry out a recursive check for same tree
    boolean breakOutOfDfs = false;
    boolean isSameTreeVal = true;
    boolean isSubTreeVal = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        dfs(root,subRoot);
        return isSubTreeVal;        
    }

    public void dfs(TreeNode node, TreeNode subRoot){
        while(!isSubTreeVal){
            if (node == null){
                return;
            }
            if (node.val == subRoot.val){
                breakOutOfDfs = false;
                isSameTreeVal = true;
                dfs_sameTree(subRoot, node);
                if (isSameTreeVal){
                    isSubTreeVal = true;
                    return;
                }
            }
            dfs(node.left, subRoot);
            dfs(node.right, subRoot);
            return;
        }
    }

    public void dfs_sameTree(TreeNode node1, TreeNode node2){
        while (!breakOutOfDfs){
            if (node1 == null && node2 == null){
                return;
            }
            if ((node1 == null && node2 != null)|| (node1 != null && node2 == null) || (node1.val != node2.val)){
                breakOutOfDfs = true;
                isSameTreeVal = false;
                return;
            }
            dfs_sameTree(node1.left,node2.left);
            dfs_sameTree(node1.right,node2.right);
            return;
        }
    }
    // Runtime = 2ms, beats 97.44% of users
    // Memory = 44.60MB, beats 28.52% of users
}
