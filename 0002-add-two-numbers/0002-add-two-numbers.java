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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int carry=0;
      int sum=0;
      ListNode dummy=new ListNode(-1);
      ListNode temp=dummy;
      ListNode t1=l1;
      ListNode t2=l2;
      while(t1!=null&&t2!=null){
        sum=carry+t1.val+t2.val;
        ListNode k=new ListNode(sum%10);
        temp.next=k;
        temp=k;
        if(sum>9)
        carry=1;
        else
        carry=0;
        t1=t1.next;
        t2=t2.next;
      }
      while(t1!=null){
        sum=carry+t1.val;
        ListNode k1=new ListNode(sum%10);
        temp.next=k1;
        temp=k1;
        t1=t1.next;
        if(sum>9)carry=1;
        else carry=0;
      }
      while(t2!=null){
        sum=carry+t2.val;
        ListNode k2=new ListNode(sum%10);
        temp.next=k2;
        temp=k2;
        t2=t2.next;
        if(sum>9)carry=1;
        else carry=0;
      }
      
        if (carry == 1) {
            temp.next = new ListNode(1);
        }
      return dummy.next;  
    }
}