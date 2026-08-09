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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int length = 0;
        ListNode curr = head;
        ListNode tail = null;
        while(curr != null){
            length++;
            tail = curr;
            curr = curr.next;
        }
        k = k % length;
        if(k == 0) return head;

        curr = head;
        for(int i = 1; i < (length - k); i++){
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;

        return newHead;
    }
}