package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordsValidator2253 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        while (in.hasNextLine()){
            String password = in.nextLine();
            Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{6,32}");
            Matcher matcher = pattern.matcher(password);
            boolean b = matcher.matches();
            if (b) {
                System.out.println("Senha valida.");
            } else System.out.println("Senha invalida.");
        }
    }
}