class Solution {
    public boolean helper(TreeNode root, int sum) {
        sum = sum + root.left.val + root.right.val;
        if(sum == root.val) {
            return true;
        }
        else return false;
    }
    public boolean checkTree(TreeNode root) {
        if(root == null) return true;
        return helper(root, 0);        
    }
}