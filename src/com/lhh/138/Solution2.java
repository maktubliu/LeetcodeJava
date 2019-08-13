//import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=138 lang=java
 *
 * [138] 复制带随机指针的链表
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
// class Node {
//     public int val;
//     public Node next;
//     public Node random;

//     public Node() {

//     }

//     public Node(int _val, Node _next, Node _random) {
//         this.val = _val;
//         this.next = _next;
//         this.random = _random;
//     }
// }
//迭代 复杂度均为O(N)
class Solution {
    HashMap<Node, Node> visited = new HashMap<Node, Node>();
    public Node getCloneNode(Node node) {
        if(node != null){
            if(this.visited.containsKey(node)){
                return this.visited.get(node);
            } else{
                this.visited.put(node, new Node(node.val, null, null));
                return this.visited.get(node);
            }
        }
        return null;
    }
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node oldNode = head;
        Node newNode = new Node(head.val);
        this.visited.put(oldNode, newNode);
        while(oldNode != null){
            newNode.next = this.getCloneNode(oldNode.next);
            newNode.random = this.getCloneNode(oldNode.random);

            oldNode = oldNode.next;
            newNode = newNode.next;
        }
        return this.visited.get(head);
    }
}