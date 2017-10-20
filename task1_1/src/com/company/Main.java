package com.company;
import java.util.Scanner;
import java.lang.String;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.nextLine();

        String string1 = new StringBuffer(string).reverse().toString();
        System.out.println("\nСтрока в обратном порядке: "+ string1 +"\n");

        System.out.println("Строка по словам: ");
        String[] string3 = string.split(" ");
        for(int i =0; i<string3.length; i++) {
            System.out.println(string3[i]);
        }

        String string4 = string.replace(' ', '*');
        System.out.println("\nСтрока со *: " + string4 + "\n");

        String string5 = string.toUpperCase();
        System.out.println("Строка с больших букв: "+ string5 + "\n");

        String string6 = string.substring(4, 10);
        System.out.println("Подстрока с 5го по 10ый символ: "+ string6);
    }
}
