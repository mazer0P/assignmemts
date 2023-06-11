package com.Recursion;

public class PrimeRec {
    // the argument of parameter x in isPrime() always should be 2
    static void isPrime(int num,int x){

        if(num==1||num==0){
            System.out.println("It's not a prime number");
            return;
        }
        if(x*x>num){
            System.out.println("It is a prime number");
            return;
        }
        if(num%x==0){
            System.out.println("It's not a prime number");
            return;
        }
        isPrime(num,x+1);
    }
    public static void main(String[] args) {
        isPrime(11,2);
        isPrime(8, 2);
        isPrime(7, 2);
        isPrime(17, 2);
        isPrime(13, 2);
        isPrime(27, 2);
    }
}
