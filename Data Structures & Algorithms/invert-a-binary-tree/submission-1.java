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
        if(root==null){
            return root;
        }

        if(root.left!=null && root.right!=null){
            TreeNode leftSubTree = invertTree(root.left);
            TreeNode rightSubTree = invertTree(root.right);

            root.left=rightSubTree;
            root.right=leftSubTree;

            return root;
        }else if(root.left!=null){
            TreeNode leftSubTree=invertTree(root.left);

            root.right=leftSubTree;
            root.left=null;
            return root;
        }else{
            TreeNode rightSubTree=invertTree(root.right);

            root.left=rightSubTree;
            root.right=null;
            return root;            
        }
    }
}
