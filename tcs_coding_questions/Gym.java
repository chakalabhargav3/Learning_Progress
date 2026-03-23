package tcs_coding_questions;

import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        double monthlyFee = 2000;
        System.out.println("Enter the number of months:");
        int n = s.nextInt();
        if(n>=3){
            System.out.println("You are eligible for the discount.");
            System.out.println("Discounted fee: " + (monthlyFee * n * 0.8));
        }
        else if(n>1){
            System.out.println("You are  eligible for the discount.");
            System.out.println("Discounted fee: " + (monthlyFee * n * 0.9));
        }
        else{
            System.out.println("You are not eligible for the discount.");
            System.out.println("Total fee: " + (monthlyFee * n));
        }


    }

}
