package java1;

public class Demo {
    public static void main(String[] args){
    AdvCalc ac = new AdvCalc();
    int addition = ac.add(10,20);
    int sub = ac.sub(15, 3);
    int mul = ac.mul(35, 7);
    double div = ac.div(17, 3);
    System.out.println(addition);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(div);

}
}
