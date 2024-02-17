// 170224 Submission

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
    public int pairSum(ListNode head) {

        // Approach
        // 1) Use two pointer technique to reach mid point of linked list
        // 2) While iterating through linked list, create node that moves in reverse from mid point (by assigning its next value to the previous node)
        // 3) Initialize answer and iterate through the 2 linked lists to check for the max value of twin sum
        // 4) Return answer
        
        ListNode fast = head , slow = head;
        ListNode previous = null;
        int answer = 0;
        ListNode tempNode = new ListNode();

        while (fast != null && fast.next != null) {
            fast = fast.next.next;  
            tempNode = slow.next;
            slow.next = previous;
            previous = slow;
            slow = tempNode;
        }

        while (slow != null && previous != null) {
            answer = Math.max(answer, slow.val + previous.val);
            slow = slow.next;
            previous = previous.next;
        }
        return answer;

        // Runtime = 4ms, beats 97.71% of users
        // Memory = 63.52MB, beats 62.78% of users
    }
}
