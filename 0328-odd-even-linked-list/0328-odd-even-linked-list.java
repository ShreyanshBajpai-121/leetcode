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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode t1=dummy1;
        ListNode t2=dummy2;
        ListNode t=head;
        int i=0;
        while(t!=null){
        if(i%2==0){
            t1.next=t;
            t=t.next;
            t1=t1.next;
        }else{
            t2.next=t;
            t=t.next;
            t2=t2.next;
        }
        i+=1;
    }
     t1.next=dummy2.next;
     t2.next=null;
     return dummy1.next;

    }
}