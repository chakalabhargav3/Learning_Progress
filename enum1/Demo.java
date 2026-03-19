package enum1;

enum Laptop{
    HP(1000), DELL(2000), MACBOOK(6700), ASUS(8900);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }   

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {

    public static void main(String[] args) {
        Laptop[] l = Laptop.values();
        for(Laptop s:l){
            System.out.println(s.ordinal()+" "+s+" "+s.getPrice());
        }
    }
    
}
