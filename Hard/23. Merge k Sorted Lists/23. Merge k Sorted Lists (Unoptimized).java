// 150524 Submission
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
    public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2){
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }

        ListNode answer = new ListNode();
        ListNode answerLoopNode = answer;
        while (list1 != null || list2 != null){
            if (list1 != null && list2 != null) {
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
    }

    public ListNode mergeKLists(ListNode[] lists) {
        // Approach
        // 1) Create a the method to merge two sorted lists from previous leetcode exercise
        // 2) Instantiate a ListNode to return as answer, assign the first ListNode of the list to the answer
        // 3) Loop through lists of listnodes and run the method while updating the answer ListNode
        // 4) Return answer
        

        if (lists.length == 0) {
            return null;
        }
        ListNode answer = lists[0];
        if (lists.length == 1){
            return answer;
        }
        ListNode traversedAnswerNode = answer;
        for (int i = 1; i < lists.length; i ++){
            answer = mergeTwoSortedLists(answer,lists[i]);
        }
        return answer;
    }

    // Runtime = 160ms, beats 6.03% of users
    // Memory = 44.34MB, beats 48.19% of users
}
