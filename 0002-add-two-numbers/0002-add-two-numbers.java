class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(0); // creating a dummy list
       ListNode curr = dummy; // initialising an pointer
       int carry = 0;

       while(l1 != null || l2 != null || carry == 1) {
        int sum = 0;
        if(l1 != null) {
            sum = sum + l1.val; // adding l1 to our sum & moving l1
            l1 = l1.next;
        }
        if(l2 != null) { // adding l2 to our sum & mving l2
            sum = sum + l2.val;
            l2 = l2.next;
        }
        sum = sum + carry; // if we carry then add it into sum
        carry = sum / 10; // if we get carry then divide it by 10 to get the carry
        ListNode node = new ListNode(sum % 10); // the value we will get by moduloing it, will become as new node so add it to the list
        curr.next = node; // carry will point to that new node if we get
        curr = curr.next;  // update the current eery time
       }
       return dummy.next; // // return dummy.next bcz, we don't want the value we have consider in it intially (that was 0)
    }
}
