package com.company;

import java.util.Scanner;

public class Combiner1238 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int amount = 0; amount < test; amount++) {
                 String word1 = in.nextLine();
                 String word2 = in.nextLine();
                 int s = -1;
            for (int i = 0; i < word1.length(); i++) {
                System.out.print(word1.charAt(i));
                for (int j = 0; j < 1; j++) {
                    s++;
                    if (i < word1.length() - 1) {
                        System.out.print(word2.charAt(s));
                    } else {
                        for (int k = s; k < word2.length(); k++) {
                            System.out.print(word2.charAt(k));
                        }
                    }
                }
            }
        }
    }
}
