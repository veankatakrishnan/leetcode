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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        getPostorderTraversal(postOrder, root);
        return postOrder;
    }

    static void getPostorderTraversal(List<Integer> postOrder, TreeNode root){
        if(root == null) return;

        getPostorderTraversal(postOrder, root.left);
        getPostorderTraversal(postOrder, root.right);
        postOrder.add(root.val);
    }
}