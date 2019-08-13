//import java.util.HashMap;
//
//class Node{
//    public int val;
//    public Node next;
//    public Node random;
//    public Node(){}
//    public Node(int _val, Node _next, Node _random){
//        this.val = _val;
//        this.next = _next;
//        this.random = _random;
//    }
//}
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
// 回溯     时间复杂度O(N), 空间复杂度O(N)
class Solution{
    HashMap<Node, Node> visited = new HashMap<Node, Node>();
    public Node copyRandomList(Node head){
       if(head == null){
           return null;
       }
       if(this.visited.containsKey(head)){
           return this.visited.get(head);
       }
       Node node = new Node(head.val, null, null);
       this.visited.put(head, node);
       node.next = copyRandomList(head.next); 
       node.random = copyRandomList(head.random);
       return node;
    }
}