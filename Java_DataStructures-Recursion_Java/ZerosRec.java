package com.Recursion;

public class ZerosRec {
    // STACK BUILDING
    static void countZero(int num,int count){
        if(num==0){
            System.out.printf("The number of zeros are : %s\n",count);
            return;
        }
        if(num%10==0){
            count+=1;
        }
        countZero(num/10, count);
    }
    // STACK FALLING
    static int  countZero2(int num){
        if(num==0){
            return 0;
        }
        int count = countZero2(num/10);
        if(num%10==0){
            count+=1;
        }
        return count;

    }
    public static void main(String[] args) {
        countZero(38090, 0);
        countZero(4000, 0);
        countZero(708090, 0);
        System.out.println("The number of zeros are :"+countZero2(1000));
        System.out.println("The number of zeros are : "+countZero2(30330));
    }
}
