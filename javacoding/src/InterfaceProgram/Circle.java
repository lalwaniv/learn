package InterfaceProgram;
import abstractDemo.*;

public class Circle extends Shape implements ShapeConstants{
	double r;
	
	public Circle(double radius) {
		this.r = radius;
	}

	@Override
	public double calcArea() {
		
		// TODO Auto-generated method stub
		return (pi*r*r);
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return (2*pi*r);
	}
}
