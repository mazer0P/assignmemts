package com.Recursion;

public class NaturalNumbers {
    /// USING TAIL RECURSION
    static void sumNat(int num,int sum){
        if(num==1){
            sum+=num;
            System.out.println("The sum of natural numbers are : "+sum);
            return;
        }
        sum+=num;
        sumNat(num-1,sum);
    }
    /// USING HEAD RECURSION
    static int sumNat2(int num){
        if(num==1){
            return 1;
        }
        return num+sumNat2(num-1);
    }
    public static void main(String[] args) {
        sumNat(5, 0);
        sumNat(7, 0);
        sumNat(20, 0);
        System.out.println("The sum n natural numbers is : "+sumNat2(5));
        System.out.println("The sum n natural numbers is : "+sumNat2(6));
        System.out.println("The sum n natural numbers is : "+sumNat2(10));
    }
}
