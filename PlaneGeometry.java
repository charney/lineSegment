import java.util.Scanner;


public class PlaneGeometry {
public static double X1, X2, Y1, Y2;

public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter X1: ");
	double X1 = scanner.nextDouble();
	System.out.println("Please enter Y1: ");
	double Y1 = scanner.nextDouble();
	System.out.println("Please enter X2: ");
	double X2 = scanner.nextDouble();
	System.out.println("Please enter Y2: ");
	double Y2 = scanner.nextDouble();
	
	Point point1 = new Point(X1, Y1);
	Point point2 = new Point(X2, Y2);
	LineSegment line = new LineSegment(point1, point2);
	
}
}
