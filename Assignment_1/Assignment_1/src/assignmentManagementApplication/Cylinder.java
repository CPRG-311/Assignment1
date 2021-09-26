package assignmentManagementApplication;

public class Cylinder extends Shape {
	double radius;
	
	public Cylinder(double height, double radius) {
		super();
		this.radius = radius;
		super.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return baseArea * height;
	}
	
	
}
