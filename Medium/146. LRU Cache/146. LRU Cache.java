// 140524 Submission

class LRUCache {
    // Approach
    // 1) Create a node class to simulate a doubly linked list with the key and value attributes
    // 2) Instantiate a hashmap that stores the key as the key and the linked list node as the value
    // 3) Create a head and tail node for the LRUCache class to easily update the most recently used key and remove the least recently used key
    // 4) Update the doubly linked list as the put/get methods are called in the LRUCache class

    class Node{
        private int key;
        private int value;
        private Node next;
        private Node prev;
    }
    private Map<Integer,Node> cache = new HashMap<>();
    private int capacity;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        Node head = new Node();
        Node tail = new Node();
        head.next = tail;
        tail.prev = head;
        this.head = head;
        this.tail = tail;
    }
    
    public int get(int key) {
        Node requestedNode = cache.get(key);
        if (requestedNode != null){
            Node previousNode = requestedNode.prev;
            Node nextNode = requestedNode.next;
            Node headNextNode = head.next;
            if (previousNode == head){
                return requestedNode.value;
            }
            else{
                previousNode.next = nextNode;
                nextNode.prev = previousNode;
                headNextNode.prev = requestedNode;
                head.next = requestedNode;
                requestedNode.next = headNextNode;
                requestedNode.prev = head;
                return requestedNode.value;
            }
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        Node nodeToBeAdded = cache.get(key);
        Node headNextNode = head.next;
        if (nodeToBeAdded == null){
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            newNode.next = headNextNode;
            newNode.prev = head;
            headNextNode.prev = newNode;
            head.next = newNode;
            cache.put(key,newNode);
        }
        else {
            Node previousNode = nodeToBeAdded.prev;
            Node nextNode = nodeToBeAdded.next;
            previousNode.next = nextNode;
            nextNode.prev = previousNode;
            headNextNode = head.next;
            nodeToBeAdded.next = headNextNode;
            nodeToBeAdded.prev = head;
            head.next = nodeToBeAdded;
            headNextNode.prev = nodeToBeAdded;
            nodeToBeAdded.value = value;
            cache.put(key,nodeToBeAdded);
        }
        if (cache.size() > capacity){
            int lastNodeKey = tail.prev.key;
            Node LastNode = tail.prev;
            LastNode.prev.next = tail;
            tail.prev = LastNode.prev;
            cache.remove(lastNodeKey);
        }
    }
    // Runtime = 48ms, beats 50.65% of users
    // Memory = 112.52MB, beats 76.59% of users
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
