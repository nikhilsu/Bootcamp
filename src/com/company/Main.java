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
            qty = Integer.parseInt(input[i].substring(0,index -1 ));  // add test here to check validity

            index=input[i].indexOf(" at ");
            price = Float.parseFloat(input[i].substring(index + 4));
            input[i]=input[i].substring(0, index);
            input[i]+= ": ";

            int tax = 0;
            //System.out.println(input[i].indexOf(" imported "));
            if(input[i].indexOf("imported") != -1) {
                tax += 5;
            }
            //System.out.println(input[i].indexOf("chocolates"));
            if(input[i].indexOf("book") != -1 || input[i].indexOf("pills") != -1 || input[i].indexOf("chocolates") != -1){ //&& input[i].indexOf(" books ") == -1) {
                tax += 0;
            }
            else tax += 10;

            total_tax += (price * tax) / 100;
            total_tax = new Float(Math.round(total_tax * 20) / 20.0);
            price += (price * tax) / 100;
            price = new Float(Math.round(price * 20) / 20.0);
            total += price;
            input[i]+=price;

            System.out.println(input[i]);
        }

        System.out.println("Sales tax: "+ total_tax);
        System.out.println("Total: "+ total);
    }
}
