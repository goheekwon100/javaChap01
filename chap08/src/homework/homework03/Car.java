package homework.homework03;

public class Car {
	Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	public void startEngine() {
		engine.start();
	}
}
