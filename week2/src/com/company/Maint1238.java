package com.company;

import java.util.Scanner;

public class Maint1238 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test= in.nextInt();
        in.nextLine();
        for (int i=0;i<test;i++){
            String word1= in.nextLine();
            String word2= in.nextLine();
            System.out.println(join(word1,word2));
        }

    }
    static StringBuffer join(String a1, String a2){
        StringBuffer bufer=new StringBuffer();
        for (int i=0;i<a1.length() || i<a2.length();i++){
            if (i<a1.length()) {
                bufer.append(a1.charAt(i));
            }
            if (i<a2.length()){
                bufer.append(a2.charAt(i));
            }
        }
        return bufer;
    }
}
