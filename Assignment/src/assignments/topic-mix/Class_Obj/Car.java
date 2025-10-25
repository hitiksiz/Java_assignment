import java.util.Scanner;
// Wap to create a class Car with parameters to print them
class Car{
    String name;
    String model;
    int year;
    String color;
  Car(String name, String model, int year, String color){
    this.name = name;
    this.model = model;
    this.year = year;
    this.color = color;
  }
  void printDetails(){      // got help from ai ans 
    System.out.println("Name: " + name);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Color: " + color);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the car: ");
    String name = sc.nextLine();
    System.out.println("Enter the model of the car: ");
    String model = sc.nextLine();
    System.out.println("Enter the year of the car: ");
    int year = sc.nextInt();
    System.out.println("Enter the color of the car: ");
    sc.nextLine();
    String color = sc.nextLine();
    Car car = new Car(name, model, year, color);
    car.printDetails();
  }
}