class Solution { 
    
    public int count(ListNode head) { 
        int c = 0; 
        
        while(head != null) { 
            c++; 
            head = head.next; 
        } 
        
        return c; 
    } 
    
    public ListNode swapNodes(ListNode head, int k) { 
        
        int len = count(head); 
        
        int[] arr = new int[len]; 
        ListNode temp = head; 
        int i = 0; 
 
        // Linked List ke values array me store karna
        while(temp != null) { 
            arr[i] = temp.val; 
            i++; 
            temp = temp.next; 
        } 
 
        // kth node from beginning and kth node from end
        int t = arr[k - 1]; 
        arr[k - 1] = arr[len - k]; 
        arr[len - k] = t; 
 
        // Array se new Linked List banana
        ListNode dummy = new ListNode(0); 
        ListNode res = dummy; 
        
        for(int j = 0; j < len; j++) { 
            res.next = new ListNode(arr[j]); 
            res = res.next; 
        } 
        
        return dummy.next;     
    } 
}