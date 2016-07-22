package abstractDemo;

public class Square extends Shape{	
	private int s;
	
	public Square(int sside){
		this.s = sside ;
	}
		
	
	public double calcArea(){
		return (s*s);
	}
	public double calcPerimeter(){
		return (4*s);
	}

}
