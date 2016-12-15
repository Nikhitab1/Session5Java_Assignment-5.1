import java.util.Scanner;


public class Circle extends Figure {
	double radius;
	
	@Override
	void findArea() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of a circle\n");
		radius=s.nextDouble();

		double area=3.14*radius*radius;
		System.out.println("Area of circle is\n " + area);
		
		
	}

	@Override
	void findperimeter() {
		double perimeter=2*3.14*radius;
		System.out.println("perimeter of circle is\n " + perimeter);
		
	}
}

	
