package zoo.animal;

public class Animal {
	
	private static int counter = 0;

	final public String type = "Animal"; 
	
	protected int id = 0;
	protected int age = 0;
	protected Gender gender = null;
	protected double weight = 0.0;

	public Animal(){
		Animal.counter++;
		this.id = Animal.counter;
	}
	
	public Animal(int age, Gender gender, double weight){
		
		this();
		
		this.setAge(age);
		this.setGender(gender);
		this.setWeight(weight);
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
		else
			this.age = 0;
	}
	
	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		if (weight >= 0)
			this.weight = weight;
		else
			this.weight = 0.0;
	}

	public String getType() {
		return this.type;
	}

 	public void eat() {
		System.out.println(this.type + " is eating....");
	}
	
	public void sleep() {
		System.out.println(this.type + " is sleeping...");
	}
	
}
