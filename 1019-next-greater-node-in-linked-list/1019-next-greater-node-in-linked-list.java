class Solution {

    public int count(ListNode head) {

        int c = 0;

        while (head != null) {
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

        // Linked List -> Array
        while (temp != null) {
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }

        int[] ans = new int[n];

        // Find Next Greater Element
        for (i = 0; i < n; i++) {

            ans[i] = 0;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        return ans;
    }
}