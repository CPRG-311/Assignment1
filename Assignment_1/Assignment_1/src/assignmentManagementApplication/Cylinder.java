package assignmentManagementApplication;

public class Cylinder extends Shape implements Calculations{
	double height;
	double radius;
	
	public Cylinder(double height, double radius) {
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return baseArea * height;
	}
	
	
}
