package InheritanceAndPolymorphism;


public class Bicycle extends Vehicle {
    private int numGears;


	public Bicycle(int maxSpeed, int numGears) {
		super(maxSpeed, 2); //sets number of wheels to 2 for all bicycles
		this.numGears=numGears;
	}

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	//I used 'super' to call the appropriate fields from the Vehicle class. I had to write it in
	//such a way that I didn't call the entire method, because I didn't want to display "generic vehicle"
	//bicycle 'toString'
	@Override
	public String toString() {
		return "Bicycle [number of gears=" + numGears + ", " + "maximum speed= " + super.getMaxSpeed() + " mph, " 
				+ "number of wheels= " + super.getNumWheels() + "]";
	

	}
}
