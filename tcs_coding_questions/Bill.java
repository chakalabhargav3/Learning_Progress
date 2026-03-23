package tcs_coding_questions;

import java.util.Scanner;

public class Bill {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bill = s.nextInt();
        if(bill>5000){
            System.out.println("You are eligible for the discount.");
            System.out.println("Discounted bill: " + (bill - (bill * 0.15)));
        }
        else if(bill>=1000 && bill<=5000){
            System.out.println("You are eligible for the discount.");
            System.out.println("Discounted bill: " + (bill - (bill * 0.1)));
        }
        else if(bill<1000){
            System.out.println("You are  eligible for the discount.");
            System.out.println("Total bill: " + (bill - (bill * 0.05)));
        }
        else{
System.out.println("Not eligible for discount.");
        }
    }

}
