package regular_expression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class R {
    public static void main(String[] args) {
        int count =0;
        Pattern p = Pattern.compile("0");
        Matcher m = p.matcher("34384809094300039404903403");
        while(m.find()){
            count++;
        }
        System.out.println("Total matches found: "+count);
        
    }

}
