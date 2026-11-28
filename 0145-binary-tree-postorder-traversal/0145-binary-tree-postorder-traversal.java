class Solution {
    List<Integer> li = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {      
        if(root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            li.add(root.val);            
        }
        return li;        
    }
}