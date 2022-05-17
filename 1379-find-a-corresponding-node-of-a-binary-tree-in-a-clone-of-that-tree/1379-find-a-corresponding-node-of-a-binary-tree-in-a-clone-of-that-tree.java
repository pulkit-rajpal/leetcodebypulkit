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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if (original==null || original.val == target.val)
        {
            return cloned;
        }

        TreeNode a1  = getTargetCopy(original.left, cloned.left, target);
        TreeNode a2  =  getTargetCopy(original.right, cloned.right, target);
        return a1!=null ?  a1 : a2;
    
        
        
    }
    
}