class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode nn = new ListNode(0);
        ListNode temp = head;

        while(temp != null) {
            ListNode next = temp.next;
            ListNode prev = nn;
            while(prev.next != null && prev.next.val < temp.val) {
                prev = prev.next;
            }
            temp.next = prev.next;
            prev.next = temp;
            temp = next;
        } 
        return nn.next;       
    }
}