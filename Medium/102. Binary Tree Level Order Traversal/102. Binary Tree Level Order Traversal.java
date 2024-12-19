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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Approach
        // 1) Use a queue to do bfs and store each value in the entire queue in a list, add that list to the result
        // 2) Return that result
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> batch = new ArrayList<>();

            for (int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();
                if (node != null){
                    batch.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (batch.size() > 0){
                answer.add(batch);
            }
        }
        return answer;
    }
    // Runtime = 1ms, beats 90.80% of users
    // Memory = 45.14MB, beats 21.15% of users
}
