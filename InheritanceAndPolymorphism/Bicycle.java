package InheritanceAndPolymorphism;


public class Bicycle extends Vehicle {
    private int numGears;

    //default no arg constructor
    public Bicycle() {
        this(50, 1);
    }

	public Bicycle(int maxSpeed, int numGears) {
		super(maxSpeed, 2); //sets number of wheels to 2
		this.numGears=numGears;
	}

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	//I used 'super' to call the appropriate fields from the Vehicle class
	@Override
	public String toString() {
		return "Bicycle [number of gears=" + numGears + ", " + "maximum speed= " + super.getMaxSpeed() + ", " +
	"number of wheels= " + super.getNumWheels() + "]";
	

	}
}
