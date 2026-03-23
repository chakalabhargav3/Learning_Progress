package custom_exception;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the experience in years:");
        int experience = s.nextInt();
        try{
            if(experience< 2){
                throw new LessExperienceException("Experience should be at least 2 years");
            } else {
                System.out.println("You are eligible for the interview.");  
            }
        }catch(LessExperienceException e){
            System.out.println(e.getMessage());
        }
    }
    
}
