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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int prevCritical = -1;
        int first = -1;
        int index = 1;

        ListNode prev = head;
        ListNode curr = head.next;
        int minimumNodes = Integer.MAX_VALUE;
        while(curr != null && curr.next != null){
            ListNode next = curr.next;

            boolean isCritical = (prev.val < curr.val && curr.val > next.val) || (prev.val > curr.val && curr.val < next.val);

            if(isCritical){
                if(first == -1){
                    first = index;
                }
                else{
                    minimumNodes = Math.min(minimumNodes, index - prevCritical);
                }
                prevCritical = index;
            }
            
            index++;
            prev = curr;
            curr = next;
            next = next.next;

        }

        if(first == -1 || first == prevCritical){
            return new int[]{-1, -1};
        }
        
        int maximumNodes = prevCritical - first;
        return new int[]{minimumNodes, maximumNodes};
    }
}