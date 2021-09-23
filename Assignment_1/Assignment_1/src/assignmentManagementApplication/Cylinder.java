package assignmentManagementApplication;

public class Cylinder extends Shape {
	double radius;
	
	public Cylinder(double height, double radius) {
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
