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
            if(!temp.equals(""))
                input[n++]=temp;
            else break;
        }
       // for (int i=0;i<n;i++)
       //     System.out.println(input[i]);

        Float total_tax= new Float(0), total=new Float(0.0);

        for (int i = 0; i < n ; i++) {
            int index=0;
            int qty;
            Float price;

            while(Character.isDigit(input[i].charAt(index++)));
            qty = Integer.parseInt(input[i].substring(0,index));  // add test here to check validity

            index=input[i].indexOf(" at ");
            price = Float.parseFloat(input[i].substring(index + 4));
            input[i]=input[i].substring(0, index);
            input[i]+= ": ";

            int tax = 0;

            if(input[i].contains(" imported "))
                tax+=5;
            if(!(input[i].contains(" book ") || input[i].contains(" pills ") || input[i].contains(" pill ") || input[i].contains(" chocolates ") || input[i].contains(" books ")))
                tax+=10;

            total_tax += (price * tax) / 100;
            price += (price * tax) / 100;
            total += price;
            input[i]+=price;







        }
    }
}
