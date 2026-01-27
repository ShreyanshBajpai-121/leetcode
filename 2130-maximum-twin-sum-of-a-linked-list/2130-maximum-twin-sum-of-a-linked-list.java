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
    public int pairSum(ListNode head) {
        int max=Integer.MIN_VALUE;
        ListNode i=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=slow.next;
        slow.next=null;
        ListNode j=reverse(rev);
        while(i!=null&&j!=null){
            int maxsum=i.val+j.val;
            max=Math.max(max,maxsum);
            i=i.next;
            j=j.next;
             }
             return max;
    }
    static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode fwd=head;
        while(curr!=null){
            fwd=curr.next;;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
}