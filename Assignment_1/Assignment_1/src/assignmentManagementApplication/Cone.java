package assignmentManagementApplication;

public class Cone extends Shape{
	double radius;
	
	public Cone(double height, double radius) {
		this.radius = radius;
		super.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
