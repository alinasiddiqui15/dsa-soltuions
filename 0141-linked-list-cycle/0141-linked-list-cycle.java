public class Solution {
    public int count(ListNode head){
        int c = 0;
        while(head != null){
            c++;
            head = head.next;
        }
        return c;
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) return true;
        }
        return false;
    }
}