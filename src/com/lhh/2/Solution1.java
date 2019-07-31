/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
// */
//public class ListNode{
//    int val;
//    ListNode next;
//    ListNode(int x){
//        val = x;
//    }
//}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode pre = new ListNode(0);
       ListNode curr = pre;
       int carry = 0;
       while(l1 != null || l2 != null || carry != 0){
           if(l1 != null){
               carry += l1.val;
               l1 = l1.next;
           }
           if(l2 != null){
               carry += l2.val;
               l2 = l2.next;
           }
           curr.next = new ListNode(carry % 10);
           curr = curr.next;
           carry /= 10;
       }
       return pre.next;
    }
}