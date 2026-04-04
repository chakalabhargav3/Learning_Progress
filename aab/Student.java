package aab;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double salary;
    private int age;


    public Student(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        return (int)(this.salary-o.salary);
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
    }
    
}
