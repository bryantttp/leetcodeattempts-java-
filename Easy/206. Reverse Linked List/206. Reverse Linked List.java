// 200224 Submission

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
    public ListNode reverseList(ListNode head) {
        
        // Approach
        // 1) Instantiate 2 new Nodes to store head to loop and to store answer
        // 2) Do a while loop to loop through new Node using new Node = new Node.next
        // 3) In each loop, instantiate a temp Node to store the current Node and another to store the next iteration.
        // 4) Point the next node of the first temp Node to the answer Node and overwrite the answer Node by storing the new temp node
        // 5) set the node to the 2nd temp node to move to the next iteration of the original list
        // 6) Point head.next to null to remove the links to the old linked list

        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = new ListNode();
        ListNode ansNode = new ListNode();
        node = head;
        ansNode = head;
        while(node != null) {
            ListNode tempNode = new ListNode();
            ListNode tempNode2 = new ListNode();
            tempNode = node;
            tempNode2 = node.next;
            tempNode.next = ansNode;
            ansNode = tempNode;
            node = tempNode2;
        }
        head.next = null;
        return ansNode;

        // Runtime = 0ms , beats 100% of users
        // Memory = 42.67MB, beats 23.66% of users
    }
}
