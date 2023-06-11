package com.Recursion;

public class Palindrone {
    static int reverse(int num,int sum){
        if(num==0){
            return sum;
        }
        int rem = num%10;
        sum = 10*sum+rem;
        return reverse(num/10,sum);
    }

    static boolean  isPalindrone(int num){
        int n = reverse(num,0);
        if (num==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // System.out.println(reverse(421));
        System.out.println(isPalindrone(121));
        System.out.println(isPalindrone(1441));
        System.out.println(isPalindrone(2881));
    }
}
