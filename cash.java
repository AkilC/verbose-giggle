package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float change;
        Scanner input = new Scanner(System.in);
        //get change anytime it is not positive
        do {
            System.out.print("Change: ");
            change = input.nextFloat();
        } while(change<0);

        int cents = Math.round(change * 100);
        //System.out.println(cents);
        int coins = 0;
        
        //do algorithm while cents is greater than 0
        do {
            if(cents>=25) {
                cents += -25;
                coins++;
            } else if(cents >=10 && cents<25) {
                cents += -10;
                coins++;
            } else if(cents >=5 && cents<10) {
                cents += -5;
                coins++;
            } else if(cents >= 1 && cents<5) {
                cents += -1;
                coins++;
            }
        } while(cents>0);
        System.out.println("Number of Coins: "+coins);
    }
}
