class Solution {
    List<Integer> li = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {      
        if(root != null) {
            li.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);            
        }
        return li;        
    }
}