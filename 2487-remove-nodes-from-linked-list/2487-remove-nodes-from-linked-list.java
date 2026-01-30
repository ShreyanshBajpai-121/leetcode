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
    public ListNode removeNodes(ListNode head) {
        ListNode t1=reverse(head);
        ListNode dummy=new ListNode(-1);
        dummy.next=t1;
        ListNode prev=t1;
        ListNode fwd=t1.next;
        while(fwd!=null){
            if(prev.val>fwd.val){
                fwd=fwd.next;
                prev.next=fwd;
            }else{
                prev=fwd;
                fwd=fwd.next;
            }
        }
        return reverse(dummy.next);
    }
    static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode fwd=head;
        ListNode prev=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
}