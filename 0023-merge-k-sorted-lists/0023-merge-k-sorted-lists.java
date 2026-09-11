/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode dummy= new ListNode(0);
    ListNode res= dummy;
    public void MergedLinked(ListNode head){
        ListNode temp=head;
        while(temp != null){
            res.next=new ListNode(temp.val);
            res= res.next;
            temp=temp.next;
        }
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        for(int i = 0 ; i< n;i++){
            MergedLinked(lists[i]);
        }
        //Add list value to arraylist
        ArrayList<Integer> li= new ArrayList<>();
        ListNode temp= dummy.next;
        while(temp != null){
            li.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(li);
        //sort arraylist

        //arrayslist to linked list
        ListNode dum= new ListNode(0);
        ListNode ans= dum;
        for(int i=0;i<li.size();i++){
            ans.next=new ListNode(li.get(i));
            ans= ans.next;
        }
        return dum.next;
    }
}