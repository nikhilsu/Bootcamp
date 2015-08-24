package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner s = new Scanner(System.in);
        System.out.println("Inputs? ");
        String [] input = new String[10];
        int n=0;
        String temp;
        while(n<10) {
            temp = s.nextLine();
            if(!temp.equals(new String("")))
                input[n++]=temp;
            else break;
        }
        for (int i=0;i<n;i++)
            System.out.println(input[i]);

    }
}
