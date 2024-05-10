// 100524 Submission

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // Approach
        // 1) Loop through list and store each copy in a hashmap with the key as the current node and value as a deep copied version of the same Node
        // 2) Loop through list once more and call the copied listnodes and map it to the appropriate linked list based on the created ones in hashmap
        // 3) Return the head of that copied linked list

        Node loop = head;
        Map<Node,Node> deepCopy = new HashMap<>();
        while (loop != null) {
            Node copiedListNode = new Node(loop.val);
            deepCopy.put(loop,copiedListNode);
            loop = loop.next;
        }

        loop = head;
        while (loop != null){
            deepCopy.get(loop).next = deepCopy.get(loop.next);
            deepCopy.get(loop).random = deepCopy.get(loop.random);
            loop = loop.next;
        }
        return deepCopy.get(head);
        
        // Runtime = 0ms, beats 100% of users
        // Memory = 44.58MB, beats 27.29% of users
    }
}
