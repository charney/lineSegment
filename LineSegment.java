
public class LineSegment {

Point point1;
Point point2;

public LineSegment(Point point1, Point point2){
	this.point1 = point1;
	this.point2 = point2;
}

Point getStart(){
	return point1;
}

Point getEnd(){
	return point2;
}

public double computeSlope(){
	double slope = 0;
	return slope;
}

public double length(){
	double length = 0;
	return length;
}

double computeYIntercept(){
	double yinter = 0;
	return yinter;
}

public String toString(){
	return "y = " + computeSlope() + "x" + computeYIntercept();
}

public LineSegment scaleByFactor(double scalar){
	LineSegment newLine = null;
	return newLine;
}


}
