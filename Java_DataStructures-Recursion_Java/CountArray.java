package com.Recursion;

public class CountArray {
    //Stack build
    static void countOcc(int []arr,int num,int occ,int index){
        if(arr[index]==num){
            occ+=1;
        }
        if(index==arr.length-1){
            System.out.println("The number "+num+" occurred "+occ+" times");
            return;
        }
        countOcc(arr, num, occ, index+1);
    }
    // stackfall
    static int countOcc2(int[] arr,int num,int occ,int index){
        if(arr[index]==num){
            occ+=1;
        }
        if(index== arr.length-1){
            return occ;
        }
        int count = countOcc2(arr, num, occ, index+1);
        return count;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,5,1,6,1,2,6,7,1,2,3,4};
        countOcc(arr, 1, 0, 0);
        countOcc(arr, 2, 0, 0);
        System.out.println("The occurrence of the 3 is "+countOcc2(arr, 3, 0, 0));
        System.out.println("The occurrence of the 4 is "+countOcc2(arr, 4, 0, 0));
    }
}
