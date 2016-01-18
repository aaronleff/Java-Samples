package InheritanceAndPolymorphism;

/*In this assignment, we were instructed to create a Vehicle class with two fields, one for speed and the 
 * other for number of wheels. The Bicycle class extended the Vehicle class, adding a field of our choosing.
 * At a minimum, we had to provide a no-argument constructor and a two-argument constructor for the Vehicle class,
 *as well as getter/mutator fields. 
 *
 *In our main class, we needed to declare an array of at least 3 objects,including at least one bike 
 *and one vehicle. The assignment asked us how we could demonstrate polymorphism using the array,  using
 *whatever skills and methods we deemed necessary to complete this task. However, the more concise and clear our
 *results and explanations, the better the grade.
*/




public class Vehicle {
    private int maxSpeed;
    private int numWheels;

    //default no-arg constructor. I set maxSpeed to 80 and number of wheels to 4
    public Vehicle() {
        this(80, 4);
    }

	public Vehicle(int maxSpeed, int numWheels) {
		this.maxSpeed = maxSpeed;
		this.numWheels = numWheels;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	@Override
	public String toString() {
		return "Generic vehicle[maximum speed= " + maxSpeed + "mph" +
				", number of wheels=" + numWheels + "]";
	}

}
