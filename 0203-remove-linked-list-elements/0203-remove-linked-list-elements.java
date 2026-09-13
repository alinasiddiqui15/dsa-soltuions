class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //Base case
        if(head == null) return null;

        //Recursively process the remaining list
        head.next = removeElements(head.next, val);

        //Remove the current node if it matches val
        if(head.val == val) {
            return head.next;
        }
        return head;
    }
}