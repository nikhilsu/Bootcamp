package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner s = new Scanner(System.in);
        System.out.println("Inputs? ");
        String [] input = new String[10];
        int n=0;
        while(n<10) {
            String temp = s.nextLine();
            if(temp!="")
                input[n++]=temp;
        }

        for (int i=0;i<n;i++)
            System.out.println(input[i]);

    }
}
