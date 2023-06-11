package com.Recursion;

import java.util.Arrays;
public class SearchNreplace {
    // StackBuilding
    public static void replace(int arr[],int val,int change,int index){
        if(arr[index]==val){
            arr[index]=change;
        }
        if(index == arr.length-1){ 
            System.out.println("All the occurrence of "+val+" has change to "+change+" - "+Arrays.toString(arr));
            return;
        }
        replace(arr, val, change, index+1);
    }
    //Stackfalling
    static int[] replace2(int []arr,int val,int change,int index){
        if(index == arr.length-1){
            return arr;
        }
        int [] num = replace2(arr, val, change, index+1);
        if(arr[index]==val){
            arr[index] = change;
        }
        return num;
    }
   public static void main(String[] args) {
    int []nums = {1,3,2,5,6,2,3,4,5,7,8,9,5};
    replace(nums, 3, 4, 0);
    replace(nums, 5, 2, 0);
    System.out.println("All the occurrence of 1 has change to 2 - "+Arrays.toString(replace2(nums, 1, 2, 0)));
    System.out.println("All the occurrence of 4 has change to 5 - "+Arrays.toString(replace2(nums, 4, 5, 0)));

   } 
}
