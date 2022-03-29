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
    public TreeNode invertTree(TreeNode root) {
        // Invert a Binary Tree
        TreeNode nod = new TreeNode();
        if (root == null) return root;
        nod = root.left;
        root.left = root.right;
        root.right= nod;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}