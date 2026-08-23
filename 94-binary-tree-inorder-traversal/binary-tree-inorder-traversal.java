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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        getInorderTraversal(inorder, root);
        return inorder;
    }

    static void getInorderTraversal(List<Integer> inorder, TreeNode root){
        if(root == null) return;

        getInorderTraversal(inorder, root.left);
        inorder.add(root.val);
        getInorderTraversal(inorder, root.right);
    }
}