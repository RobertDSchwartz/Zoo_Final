package zoo.testing; 

import java.util.ArrayList;
import java.util.List;

import zoo.animal.*;

public class TestBench {
	
	private static List<Animal> zooAnimals = new ArrayList<>();
	
	TestBench(){
	}
	
	private static void unitTest1_Animal_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

		Animal animal = new Animal();
		zooAnimals.add(animal);
		displayInfo(animal);
		
		animal.setAge(1);
		animal.setGender(Gender.FEMALE);
		animal.setWeight(5.5);
		displayInfo(animal);	

	}
	
	private static void unitTest2_Animal_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Animal animal = new Animal(10, Gender.FEMALE, 100.0);
		zooAnimals.add(animal);
		displayInfo(animal);

	}

	private static void unitTest3_Bird_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Bird bird = new Bird();
		zooAnimals.add(bird);
		displayInfo(bird);
		
		bird.setAge(1);
		bird.setGender(Gender.MALE);
		bird.setWeight(0.5);
		displayInfo(bird);
		
		bird.eat();
		bird.sleep();
		bird.fly();
	}

	private static void unitTest4_Fish_Overload() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Fish fish = new Fish(2, Gender.MALE, 10.5);
		zooAnimals.add(fish);
		displayInfo(fish);
		
		fish.eat();
		fish.sleep();
		fish.swim();
	}
	
	private static void unitTest5_Invalid_Data() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		Bird bird = new Bird(-2, Gender.MALE, -10.5);	
		TestBench.displayInfo(bird);
		
		bird.setWingspan(-1);
		System.out.println("The bird's wingspan is " + bird.getWingspan());
		System.out.println();
		
		Fish fish = new Fish(-2, Gender.FEMALE, -10.5);	
		TestBench.displayInfo(fish);
		fish.setWaterType(Water.SALT);
		System.out.println("The fish is a " + fish.getWaterType() + " water fish");

	}
		
	private static void displayInfo(Animal animal) {
		System.out.printf("ID: %-3d  Type: %-10s Gender: %-10s Age: %3d   Weight: %8.2f\n",
				animal.getId(), animal.getType(), animal.getGender(), animal.getAge(), animal.getWeight());
	} 

	private static void displayReport() {
		
		System.out.println();
		System.out.println("============== ZOO REPORT ============");
		System.out.println("ID  Type       Gender     Age   Weight");
		System.out.println("=== ========== ========== === ========");
		
		for (Animal animal : zooAnimals) {
			System.out.printf("%-3d %-10s %-10s %3d %8.2f\n",
					animal.getId(), animal.getType(), animal.getGender(), animal.getAge(), animal.getWeight());
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		TestBench.unitTest1_Animal_Default();
		TestBench.unitTest2_Animal_Overload();
		TestBench.unitTest3_Bird_Default();
		TestBench.unitTest4_Fish_Overload();
		TestBench.unitTest5_Invalid_Data();
		
		TestBench.displayReport();
		
	}

}
