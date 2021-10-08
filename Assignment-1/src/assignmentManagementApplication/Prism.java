package assignmentManagementApplication;

/**
 * 
 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
 * 
 * This class extends shape and creates a object called Prism
 * 
 * Requires a shape
 *
 */
public abstract class Prism extends Shape {
	double sideLength;
	
	/**
	 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
	 * 
	 * This method gets the side length and returns it for the prism shapes that are based off the prism.
	 * 
	 * 
	 * @return sideLength - returns the side length for the prisms that need it.
	 */
	public double getSideLength() {
		return sideLength;
	}
	
	/**
	 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
	 * 
	 * This method sets the side length for the prims.
	 * 
	 * @param sideLength - this parameter contains the value for the side length.
	 */
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	public abstract double calculateBaseArea();
	public abstract double calculateVolume();
}
