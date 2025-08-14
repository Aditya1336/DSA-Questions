package Trees.ZigZag_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Deque;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList();
        }
        List<List<Integer>> res = new ArrayList<>();
        boolean reverse = false;
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offerLast(root);

        while(!dq.isEmpty()){
            List<Integer> currentLevel = new ArrayList<>();
            int currentLevelSize = dq.size();

            for(int i=0;i<currentLevelSize;i++){
                if(!reverse){
                    TreeNode current = dq.removeFirst();
                    if(current.left!=null){
                        dq.addLast(current.left);
                    }
                    if(current.right!=null){
                        dq.addLast(current.right);
                    }
                    currentLevel.add(current.val);
                }
                else{
                    TreeNode current = dq.removeLast();
                    if(current.right!=null){
                        dq.addFirst(current.right);
                    }
                    if(current.left!=null){
                        dq.addFirst(current.left);
                    }
                    currentLevel.add(current.val);
                }
            }
            res.add(currentLevel);
            reverse = !reverse;
        }

        return res;
    }
}