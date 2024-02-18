//180224 Submission

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

        // Approach
        // 1) Replace current node's value and memory address with the next node

        node.val = node.next.val;
        node.next = node.next.next; 

        // Runtime = 0ms , beats 100% of users
        // Memory = 44.05MB, beats 32.60% of users
        
    }

    
}
