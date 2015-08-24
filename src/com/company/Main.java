package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

        Float total_tax= new Float(0), total=new Float(0);

        for (int i = 0; i < n ; i++) {
            /*

            while(Character.isDigit(input[i].charAt(index++)));
            int qty = Integer.parseInt(input[i].substring(0, index - 1));  // add test here to check validity

            */

            int index =input[i].indexOf(" at ");
            Float price = Float.parseFloat(input[i].substring(index + 4));

            int tax = 0;

            if(input[i].contains(" imported ")) {
                tax += 5;
            }

            if(!input[i].contains(" book ") && !input[i].contains(" books ") && !input[i].contains(" pills ") && !input[i].contains(" chocolates ") && !input[i].contains(" chocolate ")){
                tax += 10;
            }

            input[i]=input[i].substring(0, index);
            input[i]+= ": ";
            if(tax != 0) {
                total_tax += (price * tax) / 100;
                price += (price * tax) / 100;
                price = new Float(Math.round(price / 0.05) * 0.05);
            }
            total += price;
            input[i]+=price;

            System.out.println(input[i]);
        }

        total_tax = new Float(Math.round(total_tax / 0.05) * 0.05);
        System.out.println("\nSales tax: "+ total_tax);
        System.out.println("Total: "+ total);
    }
}
