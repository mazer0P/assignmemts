package com.Recursion;

import java.util.ArrayList;

public class AddingStar {
    static ArrayList<Character> arr;
    static String word ="";
    static void addStar(String s,int size){
        if(s.length()==0){
            System.out.println(arr.toString());
            display(arr, 0,size);
            return;
        }
        if(s.length()==1){
            arr.add(s.charAt(0));
            size+=1;
            System.out.println(arr.toString());
            display(arr, 0,size);
            return;

        }
        if(s.charAt(0)==s.charAt(1)){
            arr.add(s.charAt(0));
            arr.add('*');
            s=s.substring(1);
            size+=2;
            addStar(s,size);
        }
        else{
            arr.add(s.charAt(0));
            s=s.substring(1);
            size+=1;
            addStar(s,size);
        }
    }
    static void takeString(String s){
        arr = new ArrayList<>();
        addStar(s,0);
    }
    static void display(ArrayList<Character> arr,int i,int size){
        if(i==size-1){
            word+= arr.get(i);
            System.out.println("The new String will be  :"+word);
            return;
        }
        word += arr.get(i);
        display(arr, i+1,size);

    }
    public static void main(String[] args) {
        takeString("aabbccd");
        takeString("abbccddkkaamm");
        takeString("hshassjdbb");
        takeString("uunnnaaall");
    }
}
