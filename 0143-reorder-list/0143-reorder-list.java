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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        ListNode rev = slow.next;
        slow.next = null;
        ListNode j = reverse(rev);

        // merge two halves
        ListNode i = head;
        ListNode t = i;

        while (i != null && j != null) {
            ListNode iNext = i.next;
            ListNode jNext = j.next;

            t.next = j;
            t = j;

            t.next = iNext;
            t = iNext;

            i = iNext;
            j = jNext;
        }
    }

    static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}
