import java.util.*;


//Definition for a binary tree node.
public class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode() {}
 TreeNode(int val) { this.val = val; }
 TreeNode(int val, TreeNode left, TreeNode right) {
 this.val = val;
 this.left = left;
 this.right = right;
 }
 }
 
class Solution {
    static int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    public static int height(TreeNode node){
        if(node==null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight;

        diameter = Math.max(dia,diameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}


