package zoo.animal;

public class Bird extends Animal {

	final String type = "Bird";
	
	private double wingspan;

	public Bird(){
		this(0, null, 0.0); //age, gender, weight
	}
	
	public Bird(int age, Gender gender, double weight) {
		super(age, gender, weight);
		this.wingspan = 0.0;
	}
	
	@Override
	public String getType() {
		return this.type;
	}

	public double getWingspan() {
		return this.wingspan;
	}

	public void setWingspan(double wingspan) {
		if(wingspan >= 0)
			this.wingspan = wingspan;
		else
			this.wingspan = 0;
	}
	
	public void fly() {
		System.out.println(this.type + " is flying....");
	}
	
}
