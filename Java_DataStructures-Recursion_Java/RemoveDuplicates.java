package com.Recursion;

import java.util.Arrays;

public class RemoveDuplicates {
    static char []arr;
    static String word ="";
    static void remove(String s,int index){
        if(index == arr.length-1){
            arr[index]= s.charAt(0);
            System.out.println(Arrays.toString(arr));
            Display(arr, 0);
            return;
        }
        if(index==arr.length){
            System.out.println(Arrays.toString(arr));
            Display(arr, 0);
            return;
        }
        if(s.charAt(0)!=s.charAt(1)){
            arr[index] = s.charAt(0);
            s = s.substring(1);
            remove(s, index+1);
        }
        else{
            arr[index] = s.charAt(0);
            arr[index+1] = '#';
            s = s.substring(2);
            remove(s, index+2);
        }
    }
    static void RemoveDuplicate(String s){
        arr = new char[s.length()];
        remove(s, 0);
    }
    static void Display(char []arr,int index){
        if(index==arr.length-1){
            System.out.println("The new String is : "+word);
            return;
        }
        word += arr[index];
        Display(arr, index+1);
    }
    public static void main(String[] args) {
        RemoveDuplicate("aabbccdd");
        RemoveDuplicate("abbcdde");
        RemoveDuplicate("aabbccddee");
        RemoveDuplicate("abbccddeeffgghh");
    }
}
