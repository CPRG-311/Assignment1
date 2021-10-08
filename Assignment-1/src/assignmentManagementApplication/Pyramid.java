package assignmentManagementApplication;

/**
 * @author Ashley Drinkill, Gia Hoa (Tom) Hyugen, Kolby Robertson, Ethan Wright
 * This class is an extension of a Shape, and creates a Pyramid Shape object
 * It requires a: 
 * 	height
 * 	edge length
 *
 */
public class Pyramid extends Shape {
	double sideLength;
	
	public Pyramid(double height, double edgeLength) {
		super();
		super.height = height;
		this.sideLength = edgeLength;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	/**
	 * implements the area formula for Pyramids, an overridden method of the
	 * Shape abstract class
	 * formula: side**2
	 */
	@Override
	public double calculateBaseArea() {
		return Math.pow(sideLength,2);
	}

	/**
	 * implements the volume formula for Pyramids, an overridden method of the
	 * Shape abstract class
	 * formula: side**2 * height * (1/3)
	 */
	@Override
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return (1.0/3) * height * baseArea;
	}

	@Override
	public String toString() {
		return "Pyramid [sideLength=" + sideLength + ", height=" + height + ", BaseArea="
				+ calculateBaseArea() + ", Volume=" + calculateVolume() + "]";
	}
	
	
}
