/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */
class Solution {
    public int firstUniqChar(String s) {
       int index = -1;
       for(char ch = 'a'; ch <= 'z'; ch++){
           int beginIndex = s.indexOf(ch);
           if(beginIndex != -1 && beginIndex == s.lastIndexOf(ch)){
               index = (index == -1 || index > beginIndex) ? beginIndex : index;
           }
       }
       return index;
    }
}

