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
    public ListNode sortList(ListNode head) {
 if (head == null || head.next == null) return head;       
  ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode haedn=slow.next;
        slow.next=null;
        ListNode head1=sortList(head);
        ListNode head2=sortList(haedn);
        return merge(head1,head2);
    }
    static ListNode merge(ListNode head1,ListNode head2){
        ListNode i=head1;
        ListNode j=head2;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        while(i!=null&&j!=null){
            if(j.val>=i.val){
                k.next=i;
                i=i.next;
            }else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
            if(i==null){
                k.next=j;
            }else{
                k.next=i;
            }
        return dummy.next;
    }
}