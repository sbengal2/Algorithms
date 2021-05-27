// DFS
/**
 * TC: O(n)
 * SC: O(n) (best case when the tree is balanced: O(log n)
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}

// BFS
/**
 * TC: O(n)
 * SC: O(n) (best case when the tree is balanced: O(log n)
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            depth++;
        }
        
        return depth;
    }
}
