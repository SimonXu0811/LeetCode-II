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
    List<Integer> list = new ArrayList<>();
    public int countNodes(TreeNode root) {
        DFS(root);
        return list.size();
    }
    
    private void DFS(TreeNode root){
        if(root == null) return;
        list.add(root.val);
        DFS(root.left);
        DFS(root.right);
    }
}
