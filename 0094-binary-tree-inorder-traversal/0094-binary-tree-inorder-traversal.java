class Solution {
    List<Integer> li = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null) {
        inorderTraversal(root.left);
        li.add(root.val);
        inorderTraversal(root.right);
        }  
        return li;     
    }
}