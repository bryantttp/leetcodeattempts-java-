// 070524 Submission

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Approach
        // 1) Two pointer method
        // 2) While loop to check if the fast pointer or the next point of fast pointer has reached null
        // 3) In the while loop, at any point where the slow pointer and fast pointer is the same, this means that there is a cycle
        // 4) If there isnt a cycle, the loop will be broken and thus means that there is no cycle

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer){
                return true;
            }
        }
        return false;

        // Runtime = 0ms, beats 100% of users
        // Memory = 44.26MB, beats 59.11% of users
    }
}
