
public class Point {

private double x,y;	

public Point(double x, double y){
	this.x = x;
	this.y = y;
}
	
public String toString(){
	return "(" + x +"," + y + ")";
}

public double getX(){
	return x;
}

public double getY(){
	return y;
}

}
