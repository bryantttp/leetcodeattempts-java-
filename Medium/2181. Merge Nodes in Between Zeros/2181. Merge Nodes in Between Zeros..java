// 180224 Submission

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
    public ListNode mergeNodes(ListNode head) {
        
        // Approach
        // 1) Initialize a new ListNode to store the answer
        // 2) Iterate through linked list and check its value. For each iteration, use a temp counter to add up all the values of the iterated nodes.
        // 3) If the node value is zero, add a node to the answer with a value of the temp counter and reset the temp counter.
        // 4) Return the answer ListNode

        ListNode answer = new ListNode();
        ListNode currentNode = new ListNode();
        ListNode currentAnsNode = new ListNode();
        currentNode = head.next;
        answer = currentAnsNode;
        int tempCounter = 0;
        while (currentNode != null) {
            if (currentNode.val != 0) {
                tempCounter += currentNode.val;
            }
            else {
                ListNode tempNode = new ListNode(tempCounter);
                currentAnsNode.next = tempNode;
                tempCounter = 0;
                currentAnsNode = currentAnsNode.next;
            }
            currentNode = currentNode.next;
        }
        return answer.next;

        // Runtime = 5ms, beats 91.69% of users
        // Memory = 81.90MB, beats 68.23% of users
    }
}
