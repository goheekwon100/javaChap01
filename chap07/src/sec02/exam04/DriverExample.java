
package sec02.exam04;

public class DriverExample {
	public static void main(String[] args) {
		Driver diver = new Driver();
		
		Bus bus = new Bus();
		diver.drive(bus);
		
		Taxi taxi = new Taxi();
		diver.drive(taxi);
	}
}
