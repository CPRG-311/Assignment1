package assignmentManagementApplication;

/**
 * @author Ashley Drinkill, Gia Hoa (Tom) Hyugen, Kolby Robertson, Ethan Wright
 * This class is an extension of a Shape, and creates a Cylinder Shape object
 * It requires a: 
 * 	height
 * 	radius
 *
 */
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
	
	/**
	 * implements the area formula for Cylinder, an overridden method of the
	 * Shape abstract class
	 * formula: pi * radius**2
	 */
	public double calculateBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	/**
	 * implements the volume formula for Cylinder, an overridden method of the
	 * Shape abstract class
	 * formula: pi * radius**2 * height
	 */
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return baseArea * height;
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + ", BaseArea=" + calculateBaseArea()
				+ ", Volume=" + calculateVolume() + "]";
	}
}
