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

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);


        return Math.max(leftHeight+rightHeight, Math.max(leftDiameter,rightDiameter));

    }
}
