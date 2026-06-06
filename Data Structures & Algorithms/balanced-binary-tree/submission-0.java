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

    public int height(TreeNode head){
        if(head==null){
            return 0;
        }

        return Math.max(height(head.left), height(head.right))+1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(rightHeight - leftHeight)<=1){
            boolean checkLeftSubTree = isBalanced(root.left);
            boolean checkRightSubTree = isBalanced(root.right);

            if(checkLeftSubTree && checkRightSubTree){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
