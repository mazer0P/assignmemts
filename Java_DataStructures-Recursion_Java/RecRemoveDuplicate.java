package com.Recursion;

import java.util.Arrays;

import javax.xml.transform.Source;

public class RecRemoveDuplicate {
    static int Search(int []arr,int val,int i){
        if(arr[i]==val){
            return i;
        }
        if(i==arr.length){
            return -1;
        }
        Search(arr, val, i+1);

    }
    

    public static void main(String[] args) {
    }
       
}
