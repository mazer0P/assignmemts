package com.Recursion;

public class Recursion{
    static void printFun(int test){
        if(test<1){
            return;
        }
        else{
            System.out.print(test);
            printFun(test-1);
            System.out.print(test);
        }
    }
    public static void main(String[] args) {
        printFun(4);
    }
}