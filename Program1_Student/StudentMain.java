//KEERTHANA G, 1WN25CS108 : LAB PROGRAM1
import java.util.Scanner;
class Student {
    String usn;
    String name;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
    void display() {
        System.out.println("USN: " + usn + ", Name: " + name);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("//KEERTHANA G, 1WN25CS108 : LAB PROGRAM1");
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Student 1:");
        s1.accept();
        System.out.println("Student 2:");
        s2.accept();
        System.out.println("Student 3:");
        s3.accept();

        System.out.println("\nStudent Details:");
        s1.display();
        s2.display();
        s3.display();
    }
}