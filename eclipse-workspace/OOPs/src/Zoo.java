import java.util.ArrayList;
import java.util.List;

abstract class Animal {
	private String name;
	private int age;
	public abstract void makeSound();
	public String getDetails() {
		return "Name: "+name+", Age: "+age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
class Lion extends Animal {
	public Lion(String name, int age) {
		super(name, age);
	}

	public void makeSound() {
		System.out.println("Lion roars....");
	}
}
class Elephant extends Animal{
	public Elephant(String name, int age) {
		super(name, age);
	}

	public void makeSound() {
		System.out.println("Elephant trumpets....");
	}
}
class Monkey extends Animal{
	public Monkey(String name, int age) {
		super(name, age);
	}

	public void makeSound() {
		System.out.println("Monkey chatters.....");
	}
}
class Zoodata{
	private List<Animal> animals;
	public Zoodata(){
		this.animals = new ArrayList<Animal>();
	}
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	public void listAnimals() {
		for (Animal animal : animals) {
			System.out.println(animal.getDetails());
		}
	}
	public void feedAnimals() {
		System.out.println("Feeding all animals in the zoo..");
	}
	public double averageAge() {
		double res=0;
		int totalAge=0;
		for (Animal animal : animals) {
			totalAge+=animal.getAge();
		}
		res=(double)totalAge/animals.size();
		return res;
	}
}
public class Zoo {

	public static void main(String[] args) {
		Lion l = new Lion("Simba" ,10);
		Elephant e = new Elephant("Dumbo",5);
		Monkey m = new Monkey("Momo",3);
		Zoodata zoodata = new Zoodata();
		zoodata.addAnimal(l);
		zoodata.addAnimal(e);
		zoodata.addAnimal(m);
		zoodata.listAnimals();
		zoodata.feedAnimals();
		System.out.println("The average age of animals:" +(int)zoodata.averageAge()+" years");

	}

}
