class Solution {
    public int count(ListNode head) {
        int c = 0;
        while(head != null) {
            c++;
            head = head.next;
        }
        return c;
    }
    public int[] nextLargerNodes(ListNode head) {
        int n = count(head);
        int[] arr = new int[n];

        ListNode temp = head;
        int i = 0;
        //convert linkedlist to array
        while(temp != null) {
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }

        int[] res = new int[n];

        //find next greater element
        for(i=0; i<n; i++) {
            res[i] = 0;
            for(int j=i+1; j<n; j++) {
                if(arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        } 
        return res;       
    }
}