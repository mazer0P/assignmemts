package com.Recursion;

public class ElementIndex {
    // stack building
    static void SearchIndex(int arr[],int i,int num){
        if(arr[i]==num){
            System.out.println("Element found at index - "+i);
            return;
        }
        if(i==0){
            System.out.println("Not found!");
            return;
        }
        SearchIndex(arr, i-1, num);
    }
    // Stack falling
    static int SearchIndex2(int []arr,int num,int i){
        if(num==arr[i]){
            return i;
        }
        if (i==0){
            return -1;
        }
        int post = SearchIndex2(arr, num, i-1);
        return post;
    }
    public static void main(String[] args) {
        int [] nums = {5,6,8,9,10,13,14,16,21};
        SearchIndex(nums, nums.length-1, 17);
        SearchIndex(nums, nums.length-1, 10);
        SearchIndex(nums, nums.length-1, 9);
        SearchIndex(nums, nums.length-1, 5);
        System.out.println("The element is at index - "+SearchIndex2(nums, 4, nums.length-1));
        System.out.println("The element is at index - "+SearchIndex2(nums, 13, nums.length-1));

    }
}
