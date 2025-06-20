// 200625 Submission

class Solution {
    int res = 0;
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inOrderTraversal(root);
        return res;
    }

    public void inOrderTraversal(TreeNode node){
        if (node == null){
            return;
        }
        if (node.left != null){
            inOrderTraversal(node.left);
        }
        count -= 1;
        if (count == 0){
            res = node.val;
            return;
        }
        if (node.right != null){
            inOrderTraversal(node.right);
        }
    }

    // Runtime = 0ms, beats 100% of users
    // Memory = 44.89MB, beats 15.68% of users
}
