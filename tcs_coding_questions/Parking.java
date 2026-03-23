package tcs_coding_questions;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hoursParked = s.nextInt();
        double parkingFee = 0;
        if(hoursParked<=2){
            parkingFee = hoursParked * 100;
        }
        else if(hoursParked>2 && hoursParked<=5){
            parkingFee = (2 * 10) + ((hoursParked - 2) * 15);
        }
        else{
            parkingFee = (2 * 10) + (3 * 15) + ((hoursParked - 5) * 20);
        }
        System.out.println("Total parking fee: " + parkingFee);
    }

}
