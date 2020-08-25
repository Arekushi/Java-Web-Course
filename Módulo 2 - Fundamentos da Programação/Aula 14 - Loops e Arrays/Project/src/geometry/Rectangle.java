package geometry;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	@Override
	public String toString() {
		return String.format("Area: %.2f%nPerimeter: %.2f%nDiagonal: %.2f%n", 
				area(), perimeter(), diagonal());
	}
}
