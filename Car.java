
class Car { 
    String brand; 
    int year; 
    double price; 
    // Constructor 
    Car(String brand, int year, double price) { 
        this.brand = brand; 
        this.year = year; 
        this.price = price; 
    } 
    // Display method 
    void displayInfo() { 
        System.out.println("Brand: " + brand); 
        System.out.println("Year: " + year); 
        System.out.println("Price: $" + price); 
        System.out.println("----------------------"); 
    } 
} 
 
public class CarInfo { 
    public static void main(String[] args) { 
        // Create 4 car objects 
        Car car1 = new Car("Toyota", 2020, 25000); 
        Car car2 = new Car("Honda", 2021, 27000); 
        Car car3 = new Car("Ford", 2019, 23000); 
        Car car4 = new Car("BMW", 2022, 45000); 
        // Display information 
        System.out.println("Car Information:"); 
        System.out.println("================="); 
        car1.displayInfo(); 
        car2.displayInfo(); 
        car3.displayInfo(); 
        car4.displayInfo(); 
    } 
} 
