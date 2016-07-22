package abstractDemo;

public class Calculation {
	public static void main(String[] args) {
		Triangle t = new Triangle(10,20,5,5);
		t.setSides(3);
		System.out.println("Triangle");
		System.out.println("Area: " + t.calcArea());
		System.out.println("Perimeter: "+t.calcPerimeter());
		System.out.println("Sides: "+t.getSides());
		System.out.println();
		
		Square s = new Square(4);
		s.setSides(4);
		System.out.println("Square");
		System.out.println("Area: " + s.calcArea());
		System.out.println("Perimeter: "+s.calcPerimeter());
		System.out.println("Sides: "+s.getSides());
		
		
		
	}
	
}
