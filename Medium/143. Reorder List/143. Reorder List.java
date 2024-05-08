// 080524 Submission

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
        // Approach
        // 1) Use two pointer technique to reach the midpoint of linkedlist
        // 2) Modify the back half of the linkedlist by reversing it
        // 3) Rearrange the head to reorder the linkedlist

        if (head.next != null){
            ListNode slowPointer = head;
            ListNode fastPointer = head;
            while (fastPointer.next != null && fastPointer.next.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }

            ListNode reversedHalf = slowPointer.next;
            ListNode nodeTraversal = slowPointer.next.next;
            reversedHalf.next = null;
            while (nodeTraversal != null){
                ListNode nextNode = nodeTraversal.next;
                nodeTraversal.next = reversedHalf;
                reversedHalf = nodeTraversal;
                nodeTraversal = nextNode;
            }
            ListNode reversedHalfNode = reversedHalf;
            slowPointer.next = null;
            ListNode originalPointer = head;
            while(originalPointer != null && reversedHalfNode != null){
                ListNode reversedHalfNextNode = reversedHalfNode.next;
                ListNode originalPointerNextNode = originalPointer.next;
                originalPointer.next = reversedHalfNode;
                reversedHalfNode.next = originalPointerNextNode;
                originalPointer = originalPointerNextNode;
                reversedHalfNode = reversedHalfNextNode;
            }
        }

        // Runtime = 1ms, beats 99.81% of users
        // Memory = 47.96MB, beats 75.61% of users
    }
}
