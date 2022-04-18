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
    PriorityQueue queue;
    public int kthSmallest(TreeNode root, int k) {
        queue = new  PriorityQueue<Integer>();
        ksmall(root);
        for(int i =0;i<k-1;i++){
        queue.poll();
        }
        return (int) queue.poll();
    }
    
    
    public void ksmall(TreeNode root)
    {
        if (root == null) return ;
        queue.add(root.val);
        ksmall(root.left);
        ksmall(root.right);
    }
}