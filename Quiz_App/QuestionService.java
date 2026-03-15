package Quiz_App;

import java.util.Scanner;

public class QuestionService {

    Question[] q = new Question[5];
    


    QuestionService(){
        q[0] = new Question(1, "What is ur name?", "Nani", "Bhargav", "Ravi", "Ramu", "Bhargav");
        q[1] = new Question(2, "What is ur father name?", "Ramu", "Raju", "Ravi", "Sita", "Ramu");
        q[2] = new Question(3, "What is ur mother name?", "Ramboi", "Gayi", "Sunanya", "Yashoda", "Yashoda"); 
        q[3] = new Question(4, "What is ur sister name?", "Gayi", "Radha", "Maven", "Uma", "Gayi");
        q[4] = new Question(5, "What is ur wife name?", "Navani", "Kunni", "Sita", "Radha", "Radha");        
    }

    public void playQuiz(){
        int count = 0; 
        for(Question q1: q){
            System.out.println("***********************************");
            System.out.println(q1.getQuestion());
            System.out.println(q1.getOpt1());
            System.out.println(q1.getOpt2());
            System.out.println(q1.getOpt3());
            System.out.println(q1.getOpt4());
            Scanner s = new Scanner(System.in);
            System.out.println("-------------------------------------");
           String ans =  s.nextLine();
           if(ans.equalsIgnoreCase(q1.getAnswer())){
                count++;
           }
           else{

           }
            
        }
        System.out.println("Total Score = "+count);
    }
    
}
