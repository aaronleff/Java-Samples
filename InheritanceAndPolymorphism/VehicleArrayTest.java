package InheritanceAndPolymorphism;

public class VehicleArrayTest {
	public static void main(String[] args) {

	 Vehicle[] myVehicles = new Vehicle[5];
	 
	 //print out if it is calling a Bicycle rather than a generic Vehicle
	 myVehicles[0] = new Vehicle(120, 4);
	 myVehicles[1] = new Bicycle(30, 10);
     myVehicles[2] = new Bicycle(20, 3);
     myVehicles[3] = new Vehicle();
     myVehicles[4] = new Bicycle(50, 18);

     System.out.println("My vehicles: ");

     //polymorphic behavior. 'v' variable can call either bicycle or vehicle
     for (Vehicle v : myVehicles) {
         System.out.println(v);
     }
 }
}
