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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int totalNodes = 0;
        ListNode curr = head;
        while(curr != null){
            totalNodes++;
            curr = curr.next;
        }
        if(totalNodes == 1) return null;
        if(totalNodes - n == 0) return head.next;
        ListNode prev = null;
        curr = head;
        for(int i = 1; i <= (totalNodes - n); i++){
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        return head;
    }
}