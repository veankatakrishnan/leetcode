/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode after = node.next;
        ListNode curr = node;
        ListNode prev = null;
        while(after != null){
            curr.val = after.val;
            prev = curr;
            curr = curr.next;
            after = after.next;
        }
        prev.next = null;
    }
}