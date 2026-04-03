package regular_expression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word: ");
        
        int count=0;
        String str = "Bhargav is a good boy. He is very intelligent and hardworking. Bhargav loves to learn new things and is always eager to help others. Bhargav is a great friend and a wonderful person.";
        Pattern p = Pattern.compile("is");
        Matcher m = p.matcher(str);
        while(m.find()){
            count++;
        }
        System.out.println("Total matches found: "+count);

        
    }

}
