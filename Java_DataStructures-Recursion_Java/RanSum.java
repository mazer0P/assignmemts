package com.Recursion;

public class RanSum {
    // 1/1^1 + 2 / 2 ^2 + 3 / 3^3 
    /// USING VOID
    static void sumNum(float num,double sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sum += num/(Math.pow(num, num));
        sumNum(num-1, sum);
    }
    //// USING RETURN 
    static double sunNum2(float num){
        if(num==1){
            return 1;
        }
        double sum = sunNum2(num-1);
        sum+= num/((Math.pow(num, num)));
        return  sum;
    }
    public static void main(String[] args) {
        sumNum(4, 0);
        sumNum(5, 0);
        System.out.println(sunNum2(4));
        System.out.println(sunNum2(3));
    }
}
