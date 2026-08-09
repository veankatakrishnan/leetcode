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
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = slow.next;
        slow.next = null;

        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);

        ListNode newHead = new ListNode();
        ListNode tail = newHead;

        while(firstHalf != null && secondHalf != null){
            if(firstHalf.val < secondHalf.val){
                tail.next = firstHalf;
                firstHalf = firstHalf.next;
            }
            else{
                tail.next = secondHalf;
                secondHalf = secondHalf.next;
            }
            tail = tail.next;
        }

        tail.next = (firstHalf != null) ? firstHalf : secondHalf;
        return newHead.next;
    }
}