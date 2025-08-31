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
    public boolean isCousins(TreeNode root, int x, int y) {
            if(root==null){
                return false;
            }
            TreeNode xx = findNode(root,x);
            TreeNode yy = findNode(root,y);

            return (level(root,xx,0)==level(root,yy,0))&&(!isSibling(root,xx,yy));
    }

    static TreeNode findNode(TreeNode node, int key){
        if(node==null){
            return null;
        }
        if(node.val==key){
            return node;
        }
        TreeNode n = findNode(node.left,key);
        if(n!=null){
            return n;
        }
        return findNode(node.right,key);
    }

    static boolean isSibling(TreeNode node, TreeNode xx, TreeNode yy){
        if(node==null){
            return false;
        }

        return(
            (node.left==xx && node.right==yy) || (node.left==yy && node.right==xx)
            || (isSibling(node.left,xx,yy)) || (isSibling(node.right,xx,yy))
        );
    }

    static int level(TreeNode node, TreeNode n, int level){
        if(node==null){
            return 0;
        }
        if(node == n){
            return level;
        }
        int l = level(node.left,n,level+1);
        if(l!=0){
            return l;
        }
        return level(node.right,n,level+1);
    }
}