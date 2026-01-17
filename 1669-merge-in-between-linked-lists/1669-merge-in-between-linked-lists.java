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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null) return list2;
if(list2 == null) return list1;

        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode temp1=list1;
        ListNode temp2=list1;
        int i=0;
        while(i<a-1){
             temp1=temp1.next;
             i++;
        }
        i=0;
        while(i<b){
            temp2=temp2.next;
            i++;
        }
        temp1.next=list2;
        temp.next=temp2.next;
        temp2.next=null;
        return list1;
    }
}