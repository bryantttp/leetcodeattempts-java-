// 181224 Submission
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // Approach
    // 1) Iterative method to find the LCA since binary trees have the lower value on the left and bigger value on the right
    // 2) once it reaches either p or q, that would be the LCA, unless the current node is between p and q
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = root;
        while (ans != null){
            if (ans.val < p.val && ans.val < q.val){
                ans = ans.right;
            }
            else if (ans.val > p.val && ans.val > q.val){
                ans = ans.left;
            }
            else{
                return ans;
            }
        }
        return null;
    }
    // Runtime = 5ms, beats 100% of users
    // Memory = 45.04MB, beats 47.73% of users
}
