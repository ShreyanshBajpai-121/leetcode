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
    public ListNode doubleIt(ListNode head) {
        ListNode l1=reverse(head);
        ListNode dummy=new ListNode(-1);
        int mul=0;
        int carry=0;
        ListNode temp=dummy;
        ListNode t1=l1;
        while(t1!=null){
         mul=carry+(2*t1.val);
         ListNode k=new ListNode(mul%10);
          temp.next=k;
          temp=k;
          t1=t1.next;
          if(mul>9)
           carry=1;
          else
           carry=0;
        }
         if (carry == 1) {
            temp.next = new ListNode(1);
        }
        ListNode l2=reverse(dummy.next);
        return l2;
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