package geometry;

public class Triangle {
	private double vertices[];
	private double p;
	private double area;
	
	public Triangle(double[] vertices) {
		this.vertices = vertices;
		this.area = 0;
		this.p = 0;
	}
	
	public double[] getVertices() {
		return vertices;
	}
	
	public double getP() {
		return p;
	}
	
	public double getArea() {
		if(area == 0) calcArea();
		
		return area;
	}
	
	public void calcArea() {
		if(p == 0) calcP();
		
		area = Math.sqrt(p * (p - vertices[0]) * (p - vertices[1]) * (p - vertices[2]));
	}
	
	private void calcP() {
		for(int i = 0; i < vertices.length; i++)
			p += vertices[i];
		
		p /= 2;
	}
}
