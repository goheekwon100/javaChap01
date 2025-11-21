package sec04.exam06;

public class Calculator {
	int width;
	int height;
	
	double areaRectangle(double width) {
		double result = width * width;
		return result;
	}
	
	double areaRectangle(double width, double height) {
		double result = width * height;
		return result;
	}
}
