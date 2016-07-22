package abstractDemo;
public abstract class Shape {
	private int noOfSides;
	private double perimeter;
	private double area;
	
	public abstract double calcArea();
	
	public abstract double calcPerimeter();
	
	void setSides(int sides) {
		this.noOfSides = sides;
	}
	
	int getSides() {
		return this.noOfSides;
	}
}