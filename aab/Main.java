package aab;

import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] s1 = new Student[5];

        for(int i = 0; i < s1.length; i++) {
            System.out.println("Enter student details (id, name, salary, age):");
            int id = scanner.nextInt();
            String name = scanner.next();
            double salary = scanner.nextDouble();
            int age = scanner.nextInt();
            s1[i] = new Student(id, name, salary, age);
        }

            Arrays.sort(s1);

            for(Student student : s1) {
                System.out.println(student.toString());
            }
        
        System.out.println("Student created successfully!");
    }

    
}
