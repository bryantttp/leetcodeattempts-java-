// 190224 Submission

class BrowserHistory {

    // Approach
    // 1) Create a Doubly Linked List class to store next and prev webpages
    // 2) Store previous webpage into linked list as the previous node
    // 3) For back and forward methods, use pointer to move towards node while ensuring prev/next node is not null and steps is > 0

    public class Node {
        private String webpage;
        private Node next, prev;
        public Node(){

        }
        public Node(String webpage) {
            this.webpage = webpage;
            next = null;
            prev = null;
        }
    }
    Node currentWebpage = new Node();

    public BrowserHistory(String homepage) {
        currentWebpage.webpage = homepage;    
    }
    
    public void visit(String url) {
        Node tempWebpage = new Node(url);
        currentWebpage.next = tempWebpage;
        tempWebpage.prev = currentWebpage;
        currentWebpage = currentWebpage.next;        
    }
    
    public String back(int steps) {
        while (currentWebpage.prev != null && steps != 0){
            currentWebpage = currentWebpage.prev;
            steps -= 1;
        }
        return currentWebpage.webpage;
    }
    
    public String forward(int steps) {
        while (currentWebpage.next != null && steps != 0) {
            currentWebpage = currentWebpage.next;
            steps -= 1;
        }
        return currentWebpage.webpage;
        
    }
}


/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

 // Runtime = 48ms, beats 99.43% of users
 // Memory = 50.85MB, beats 48.37% of users
