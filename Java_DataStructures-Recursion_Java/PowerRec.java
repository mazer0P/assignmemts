package com.Recursion;

public class PowerRec {
    /// USING VOID
    static void power(int num,int power,int sum){
        if(power==0){
            System.out.printf("the power %S of  is : %s \n",num,sum);
            return;
        }
        sum= sum*num;
        power(num,power-1,sum);
    }
    /// USING RETURN 
    static int power2(int num,int power){
        if(power==0){
            return 1;
        }
        return num*power2(num, power-1);
    }
    public static void main(String[] args) {
        power(3, 3,1);
        int num = power2(2,3);
        System.out.printf("the power is : " +num);
    }
}
