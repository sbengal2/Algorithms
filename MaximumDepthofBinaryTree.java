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
