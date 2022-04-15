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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> array = new ArrayList<String>();
        helper(root,"", array);
        return array;
    }
    
    public void helper(TreeNode root,String s,List<String> array)
    {
        if (root == null) return;
        if( root != null)
        {
            s=s.concat(String.valueOf(root.val) + "->");
        if (root.left == null && root.right == null) {
            s=s.substring(0,s.length()-2);
            array.add(s);
            s="";
            return ;
        }
        }
        helper(root.left,s, array);
        helper(root.right, s,array);
    }
    
}