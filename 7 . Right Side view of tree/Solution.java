/*
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> rightView(Node root) {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root==null){
            return ans;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int levelSize = q.size();
            
            for(int i=0;i<levelSize;i++){
                Node node = q.poll();
                
                if(i==levelSize-1){
                    ans.add(node.data);
                }
                
                if(node.left!=null){
                    q.offer(node.left);
                }
                
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        return ans;
    }
}