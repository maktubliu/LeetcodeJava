/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        int n = word.length();
        for(int i = 0; i < n; i++){
            if(isUpperCase(word.charAt(i))){
                count++;
            }
       }
       if(count == 0 || count == n){
           return true;
       }
       if(count == 1 && isUpperCase(word.charAt(0))){
           return true;
       }
       else{
           return false;
       }
    }
    public boolean isUpperCase(char s){
        if(s >= 'A' && s <= 'Z'){
            return true;
        }
        return false;
    }
}

