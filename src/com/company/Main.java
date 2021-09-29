package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for (int i = 0; i < 10;  i=i+2) {
        //System.out.println(i);
        //}

        //for (int i = 10; i>0; i--) {
        //System.out.println(i);
        //}

        //for (int i = 0; i < 11; i++) {
           // System.out.println("Loop value =" + " " +i);
        //}
        //int x = 1;
        //while(x < 5)
        //{
           // System.out.println(x);
           // x = x + 1;
        //}

        //int z = 2;
        //do
           // {
              //  System.out.println(z);
               // z = z + 1;
            //} while(z == 3);
        //for (int i = 0; i < 5; i++) {
           // for (int j = 0; j < 5; j++) {
         //       System.out.println("i =" + i + " j ="+ j)

           // }

       // }
        System.out.println("Enter a number:");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(j+i);
            }
            System.out.println("");
        }
    }
}
