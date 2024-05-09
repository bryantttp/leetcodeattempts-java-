// 090524 Submission
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
        // Approach
        // 1) Use two pointer approach to reach end of linked list, set the fast pointer as next node of head
        // 2) For loop n-1 times and shift fast pointer forward
        // 3) While loop condition where fast pointer != null
        // 4) slow pointer.next = slow pointer.next.next
        // 5) return head
        ListNode node = new ListNode();
        node.next = head;
        ListNode slowPointer = node;
        ListNode fastPointer = head;
        for (int i = 0; i < n; i ++){
            fastPointer = fastPointer.next;
        }
        while (fastPointer != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return node.next;

        // Runtime = 0ms,
        // Memory= = 41.50MB, beats 53.99% of users
    }
}
