package com.company;

import java.util.Scanner;

public class FibonacciArray1176 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        for (int i=0;i<test;i++) {
            int a= in.nextInt();
            System.out.println("Fib("+a+") = "+fibon(a));

        }
    }
    static long fibon(int n){
        long[] fib=new long[n+2];
        fib[0]=0;
        fib[1]=1;
        for (int i =2 ; i <= n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
            return fib[n];

    }

}
