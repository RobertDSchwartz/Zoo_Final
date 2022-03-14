package zoo.animal;

public class Fish extends Animal {

	final String type = "Fish";
	
	private Water waterType;
		
	public Fish(){
		this(0, null, 0.0); // age, gender, weight
	}
	
	public Fish(int age, Gender gender, double weight) {
		super(age, gender, weight);
		this.waterType = null;
	}
	
	@Override	
	public String getType() {
		return this.type;
	}
	
	public Water getWaterType() {
		return this.waterType;
	}

	public void setWaterType(Water waterType) {
		this.waterType = waterType;
	}	

	public void swin() {
		System.out.println(this.type + " is swimming...");
	}
	
}
