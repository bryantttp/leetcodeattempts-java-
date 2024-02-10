// 110224 Submission

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
    private int gcd(int a, int b) {
        int i;
        if (a > b) {
            i = b;
        }
        else {
            i = a;
        }
        
        for (int j = i; j > 1 ;j--) {
            if (a%j == 0 && b%j == 0) {
                return j;
            }
        }
        return 1;

    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        // Approach
        // 1) method to find gcd value
        // 2) create new node with gcd as value and node.next as head.next
        // 3) set current head.next as new node
        // 4) Shift current head to next.next (skips the newly created node)

        ListNode current_node = head;

        while (current_node.next != null) {    
        ListNode new_node = new ListNode(gcd(current_node.val,current_node.next.val));
        new_node.next = current_node.next;
        current_node.next = new_node;
        current_node = current_node.next.next;
        }
        return head;

        // Testcases
        // head = [18,6,10,3] -> Returns [18,6,6,2,10,1,3]

        // Runtime = 22ms, beats 25.43% of users
        // Memory = 45.10MB, beats 44.03% of users

        

    }
}
