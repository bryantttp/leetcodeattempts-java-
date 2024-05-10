// 100524 Submission
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Approach
        // 1) While Loop through both linked list (Check that either L1 or L2 is not null)
        // 2) Create ListNode to store the answer
        // 3) Instantiate a int that stores any overflowed value from the addition of values in the nodes
        // 4) Create a ListNode that contains the value of both ListNodes and the overflowed value
        // 5) Add ListNode as the next value of the current answer
        // 6) Return answer

        int extraValue = 0;
        int tempValue = l1.val + l2.val;
        if (tempValue > 9){
            tempValue = tempValue % 10;
            extraValue = 1;
        }
        else {
            extraValue = 0;
        }
        ListNode answer = new ListNode(tempValue);
        ListNode traversalNode = answer;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null){
            if (l1 != null && l2 != null){
                tempValue = l1.val + l2.val + extraValue;
                if (tempValue > 9){
                    tempValue = tempValue % 10;
                    extraValue = 1;
                }
                else {
                    extraValue = 0;
                }
                ListNode tempNode = new ListNode(tempValue);
                traversalNode.next = tempNode;
                traversalNode = traversalNode.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if (l1 != null){
                tempValue = l1.val + extraValue;
                if (tempValue > 9){
                    tempValue = tempValue % 10;
                    extraValue = 1;
                }
                else {
                    extraValue = 0;
                }
                ListNode tempNode = new ListNode(tempValue);
                traversalNode.next = tempNode;
                traversalNode = traversalNode.next;
                l1 = l1.next;
            }
            else {
                tempValue = l2.val + extraValue;
                if (tempValue > 9){
                    tempValue = tempValue % 10;
                    extraValue = 1;
                }
                else {
                    extraValue = 0;
                }
                ListNode tempNode = new ListNode(tempValue);
                traversalNode.next = tempNode;
                traversalNode = traversalNode.next;
                l2 = l2.next;
            }
        }
        if (extraValue != 0){
            ListNode lastNode = new ListNode(extraValue);
            traversalNode.next = lastNode;
            extraValue = 0;
        }
        return answer;

        // Runtime = 1ms, beats 100% of users
        // Memory =  44.27MB, beats 63.39% of users
    }
}
