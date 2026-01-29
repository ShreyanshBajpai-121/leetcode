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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // ArrayList<ListNode>arr=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     arr.add(temp);
        //     temp=temp.next;
        // }
        // int l=left-1;
        // int r=right-1;
        // while(l<=r){
        //     ListNode t1=arr.get(l);
        //     ListNode t2=arr.get(r);
        //     arr.set(l,t2);
        //     arr.set(r,t1);
        //     l++;
        //     r--;
        // }
        // for(int i=0;i<arr.size();i++){
        //     if(i==arr.size()-1)arr.get(i).next=null;
        //     else arr.get(i).next=arr.get(i+1);
        // }
        // return arr.get(0); OR
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        temp.next=head;
        int i=1;
        while(i<=left-1){
        temp=temp.next;
        i++;
        }
        ListNode tail1=temp;
        ListNode head2=temp.next;
        i=1;
        while(i<=(right-left)+1){
            temp=temp.next;
            i++;
        }
        ListNode tail2=temp;
        ListNode head3=temp.next;
        tail1.next=null;
        tail2.next=null;
        reverse(head2);
        tail1.next=tail2;
        head2.next=head3;
        return dummy.next;

    }
    static void reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode fwd=head;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
    }
}