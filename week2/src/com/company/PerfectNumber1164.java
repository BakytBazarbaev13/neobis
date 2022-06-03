package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber1164 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        ArrayList <Integer> list=new ArrayList<Integer>();
        for (int i=0;i<test;i++){
            int c=in.nextInt();
            list.add(c);
        }
        for (int i=0;i<test;i++){
            int b=1;
            int sum=0;
            while(b<=list.get(i)/2){
                if(list.get(i)%b==0){
                    sum+=b;
                }
                b++;
            }
            if(sum==list.get(i)){
                System.out.println(list.get(i)+" eh perfeito");
            }else{
                System.out.println(list.get(i)+" nao eh perfeito");
            }
        }
    }
}
