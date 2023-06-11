package com.Recursion;

public class ArmStrongNum {
    static void isArmStrong(int num,int dummy,int length,int sum){
        if (dummy==0){
            if (sum==num){
                System.out.println(num+" is a Armstrong number");
                return;
            }else{
                System.out.println(num+" is not an Armstrong Number");
                return;
            }
        }
        int rem = dummy%10;
        sum += (int)Math.pow(rem,length);
        isArmStrong(num, dummy/10, length, sum);
    }
    public static int getlength(int num){
        String s = Integer.toString(num);
        return s.length();
    }
    public static void main(String[] args) {
        int num = 121;
        int num2 = 370;
        int num4 = 400;
        int num5 = 153;
        isArmStrong(num, num, getlength(num), 0);
        isArmStrong(num2, num2, getlength(num2), 0);
        isArmStrong(num4, num4, getlength(num4), 0);
        isArmStrong(num5, num5, getlength(num5), 0);
    }
}
