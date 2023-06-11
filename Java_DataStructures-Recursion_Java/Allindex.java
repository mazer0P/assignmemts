package com.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Allindex {
    // Stackbuild and Dynamic array;
    public static void serchAll(int []arr,int num,int index,ArrayList<Integer> count){
        if(arr[index]==num){
            count.add(index);
        }
        if(index==arr.length-1){
            System.out.println(count.toString());
            return;
        }
        serchAll(arr, num, index+1, count);
    }
    // StackFall Static array;
    static int []post;
    static int [] countIndex(int arr[],int num,int index,int count){
        if(num==arr[index]){
            count+=1;
        }
        if(index==arr.length-1){
            post= new int[count];
            return post;
        }
        post = countIndex(arr, num, index+1, count);
        if(arr[index]==num){
            post[count-1]= index;
            count -= 1;
        }
        return post;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,5,1,6,1,2,6,7,1,2,3,4};
        ArrayList<Integer> count = new ArrayList<Integer>();
        serchAll(nums, 1, 0, count);
        ArrayList<Integer> occ = new ArrayList<Integer>();
        serchAll(nums, 2, 0, occ);
        System.out.println(Arrays.toString(countIndex(nums, 1, 0, 0)));
        System.out.println(Arrays.toString(countIndex(nums, 2, 0, 0)));
        System.out.println(Arrays.toString(countIndex(nums, 3, 0, 0)));
    }
}
