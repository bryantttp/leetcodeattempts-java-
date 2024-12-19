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
    public List<Integer> rightSideView(TreeNode root) {
        // Approach
        // 1) Use a queue to do bfs to get every node based on depth
        // 2) Store the integer value of the last node on the same depth to get the right most value
        // 3) Return it as a list of integers
        List<Integer> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int rightSideVal = -1;
            for (int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();
                if (node != null){
                    rightSideVal = node.val;
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (rightSideVal != -1){
                answer.add(rightSideVal);
            }
        }  
        return answer;
    }
    // Runtime = 1ms, beats 68.60% of users
    // Memory = 42.30MB, beats 27.44% of users
}
