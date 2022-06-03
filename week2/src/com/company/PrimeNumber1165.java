package com.company;

import java.util.Scanner;

public class PrimeNumber1165 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        for (int i=1;i<=a;i++){
            int n = in.nextInt();
            if(func(n)){
                System.out.println(n+" nao eh primo");
            }else System.out.println(n+" eh primo");
        }

    }
    static boolean func(int n){
        for (int j=2;j<=n/2;j++){
            if(n%j==0) {
                    return true;
            }
        }
        return false;
    }
}
