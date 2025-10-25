import java.util.Scanner;

public class Student{
  String name;
  int rollNo;
  int age;
  String course;
  Student(String name, int rollNo, int age, String course){
    this.name = name ;
    this.rollNo = rollNo;
    this.age = age;
    this.course = course;
  }
  void printDetails(){
    System.out.println("Name: " + name+"\nRoll No: "+rollNo+"\nAge: "+age+"\nCourse: "+course);
  }
  public static void main(String[] args){
    System.out.println("Enter the details of the student:");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the student: ");
    String name = sc.nextLine();
    System.out.print("Enter the roll no of the student: ");
    int rollNo = sc.nextInt();
    System.out.print("Enter the age of the student: ");
    int age = sc.nextInt();
    System.out.print("Enter the course of the student: ");
    sc.nextLine();
    String course = sc.nextLine();
    Student student = new Student(name, rollNo, age, course);
    student.printDetails();
    sc.close();
  }
}