package java1;
public class Student{
    private int id;
    private String name;
    private int salary;

    public static void main(String[] args) {
        Student[] s = new Student[4];
        // int id;
        // String namee;
        // double salary;
        Student s1 = new Student();
        s1.id =100;
        s1.name  ="Bhargav";
        s1.salary =9080;
        s[0] = s1;

        Student s2 = new Student();
        s2.id =101;
        s2.name  ="Nandini";
        s2.salary =9085;
        s[1] = s2;
        
        Student s3 = new Student();
        s3.id =101;
        s3.name  ="Nandini";
        s3.salary =9085;
        s[2] = s3;
        
        Student s4 = new Student();
        s4.id =101;
        s4.name  ="Nandini";
        s4.salary =9085;
        s[3] = s4;

        try {
            
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        
    }

}