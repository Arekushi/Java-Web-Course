package geometry;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircunference() {
		return 2 * Math.PI * radius;
	}
	
	public double getVolume() {
		return 4 * Math.PI * Math.pow(radius, 3) / 3;
	}
	
	@Override
	public String toString() {
		return String.format("Circunference: %.2f%nVolume: %.2f%nPI: %.2f%n", 
				getCircunference(), getVolume(), Math.PI);
	}
}
