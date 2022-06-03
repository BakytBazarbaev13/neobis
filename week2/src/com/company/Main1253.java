package com.company;

import java.util.Scanner;

public class Main1253 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for (int i=0;i<num;i++){
            char cipher = 65;
            int v=cipher;
            for (int j=0;j<5;j++) {
                v = in.nextInt();

            }
            cipher= (char) v;
            System.out.println(cipher);
        }
    }
}
