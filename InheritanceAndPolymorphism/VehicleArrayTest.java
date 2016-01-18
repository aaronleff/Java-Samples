package InheritanceAndPolymorphism;

public class VehicleArrayTest {
	public static void main(String[] args) {

	 Vehicle[] myVehicles = new Vehicle[5];
	 
	 myVehicles[0] = new Vehicle(120, 4);
	 myVehicles[1] = new Bicycle(30, 10);
     	myVehicles[2] = new Bicycle(20, 3);
     	myVehicles[3] = new Vehicle();
     	myVehicles[4] = new Bicycle(50, 18);

     System.out.println("My vehicles: ");

     //I used a "foreach" loop. Because of polymorphism, the proper object will 
     //be displayed (i.e. a Bicycle or Generic Vehicle)
     for (Vehicle v : myVehicles) {
         System.out.println(v);
     }
 }
}
