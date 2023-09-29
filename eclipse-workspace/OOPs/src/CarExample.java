/*Certainly! Here's a question to practice Object-Oriented Programming (OOP):
Create a class called "Car" with the following attributes:

brand (String)
model (String)
year (int)
price (double)
Include a constructor that sets the values for the brand, model, year, and price attributes. Create getter 
and setter methods for all the attributes.

Write a method called "getAge" in the Car class that calculates and returns the age of the car by 
subtracting the year it was made from the current year.

Hint:
Use the java.time.Year class to get the current year.
The method signature for getAge would be public int getAge(). It should not take any parameters*/
import java.time.Year;
import java.util.Scanner;

class Car{
	private String brand;
	private String model;
	private int year;
	private double price;

	public Car(String brand, String model, int year, double price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
 
	public int getAge() {
		int currentYear=Year.now().getValue();
		return currentYear-year;
	}


}
public class CarExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String brand = scan.next();
		String model = scan.next();
		int year = scan.nextInt();
		int price = scan.nextInt();
		Car c1 = new Car(brand,model,year,price);
		System.out.println("The below details are shown:");
		System.out.println("Cars Age:"+c1.getAge());
	}

}
