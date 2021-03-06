package com.lhh.IntegerExt;


import java.util.*;
public class IntegerExt{
    private int i;
    private static Map<String, IntegerExt> map = new HashMap<>(256);
    private IntegerExt(int i){
        this.i = i;
    }
    public int toIntValue(){
        return i;
    }
    public static IntegerExt getInstance(int i){
       String s = String.valueOf(i);
       if(map.containsKey(s)){
           return map.get(s);
       } 
       IntegerExt result = new IntegerExt(i);
       if(i >= -128 && i <= 127){
           map.put(s, result);
       }
       return result;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof IntegerExt){
            return this.i == ((IntegerExt)obj).toIntValue();
        }
        return super.equals(obj);
    }
}