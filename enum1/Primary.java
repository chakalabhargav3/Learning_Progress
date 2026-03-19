package enum1;

enum Color {
    RED, GREEN, BLUE,Violet
}

public class Primary {
 
    public static void main(String[] args) {
        Color[] c = Color.values();
        for(Color s:c){
            System.out.println(s.ordinal()+" "+s);
        }
    }
}
