package homework.homework03;

public class Run {
	public static void main(String[] args) {
		Car newCar1 = new Car(new GasolineEngine());
		Car newCar2 = new Car(new ElectricEngine());
		
		newCar1.startEngine();
		newCar2.startEngine();
	}
}
