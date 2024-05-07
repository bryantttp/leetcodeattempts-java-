// 050724 Submission
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Approach
        // 1) Specific scenerios for head == null or head.next == null
        // 2) Instantiate a answer ListNode
        // 3) While loop to loop through both lists
        // 4) If conditionals to check if list1 or list2 is null or both is not null
        // 5) Depending on the conditional, answer.next = list1's current iteration or list2's current iteration
        // 6) Set answer to answer.next to continue combining both lists
        // 7) Return answer

        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }

        ListNode answer = new ListNode();
        ListNode answerLoopNode = answer;
        while (list1 != null || list2 != null){
            if (list1 != null&& list2 != null) {
                if (list1.val <= list2.val){
                    answerLoopNode.next = list1;
                    list1 = list1.next;
                }
                else{
                    answerLoopNode.next = list2;
                    list2 = list2.next;
                }
                answerLoopNode = answerLoopNode.next;
            }
            else if (list1 != null){
                answerLoopNode.next = list1;
                list1 = list1.next;
                answerLoopNode = answerLoopNode.next;
            }
            else {
                answerLoopNode.next = list2;
                list2 = list2.next;
                answerLoopNode = answerLoopNode.next;
            }
        }
        return answer.next;

        // Runtime = 0ms, beats 100% of users
        // Memory = 42.34MB, beats 54.81% of users
    }
}
