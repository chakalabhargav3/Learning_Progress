package custom_exception;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = s.nextInt();
        try{
            if(age<18){
                throw new VotingException("Not eligible");
            }
            else{
                System.out.println("Eligible to vote");
            }
        }catch(VotingException e){
            System.out.println(e.getMessage());

        }
    }

}
    