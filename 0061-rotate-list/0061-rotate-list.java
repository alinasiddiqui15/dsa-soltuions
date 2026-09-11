class Solution {
    public static int count(ListNode head){
        int c=0;
        while(head != null){
            head= head.next;
            c++;
        }
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {

       int n = count(head);
       if(n == 0) return head;
       k = k % n;

       int [] arr= new int [n];
       int i=0;
       ListNode temp= head;
       while(temp!=null){
        arr[i]=temp.val;
        i++;
        temp=temp.next;
       }
       int iter=1;
       while(iter<=k){
        int last = arr[n-1];
        for(int j=n-1;j>0;j--){
            arr[j]=arr[j-1];
        }
        arr[0]=last;
        iter++;
       }
        ListNode dummy= new ListNode(0);
        ListNode ans=dummy;
        for(int j=0;j<n;j++){
            ans.next=new ListNode(arr[j]);
            ans=ans.next;
        }
        return dummy.next;
        }
}