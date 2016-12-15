import java.util.Scanner;


public class Rectangle extends Figure {
 double length, width;
 
	@Override
	void findArea() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length and breadth of a rectangle\n");
		length=s.nextDouble();
        width=s.nextDouble();
        
        double area=length * width;
        System.out.println("Area of a rectangle\n " + area);
		
	}

	@Override
	void findperimeter() {
		double perimeter=2*(length*width);
		System.out.println("Perimeter of a rectangle is\n " + perimeter);
		
	}
	
	

	
	
	

}
