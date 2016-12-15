import java.util.Scanner;


public class Triangle  extends Figure{
	
	double base, height,side;
	

	@Override
	void findArea() {
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter base height and side of a triangle\n");
	base=s.nextDouble();
	height=s.nextDouble();
	side=s.nextDouble();
	
	 double Area=  (base * height)/2;
     System.out.println(" Area of a triangle is\n " + Area);
	 
		
	}

	@Override
	void findperimeter() {
	double	perimeter=base+height+side;
	System.out.println("Perimeter of a triangle is\n " + perimeter);
		
		
	}
	

}
