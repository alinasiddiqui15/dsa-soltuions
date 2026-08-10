class Solution {
    public int count(ListNode head){
        int c = 0;
        while(head != null){
            c++;
            head = head.next;
        }
        return c;
    }
    public ListNode sortList(ListNode head) {
        int n = count(head);
        int[] arr = new int[n];
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        Arrays.sort(arr);
        temp = head;
        i = 0;
        while(temp != null){
            temp.val = arr[i];
            i++;
            temp = temp.next;
        }
        return head;
    }
}