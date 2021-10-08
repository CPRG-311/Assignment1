package assignmentManagementApplication;

public class OctagonalPrism extends Prism {
	/**
	 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
	 * 
	 * This method takes in the height and side length from the App Driver
	 * it uses super to get the value from the parent which is shape,
	 * then sets the values it gets from shape to it's corresponding double value
	 * 
	 * @param height - takes in the height from the AppDriver
	 * @param side - takes in the side length from the AppDriver
	 */
	
	public OctagonalPrism(double height, double side) {
		super();
		super.height = height;
		super.sideLength = side;
	}

	/**
	 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
	 * 
	 *This method calculates the base area for the OctagonalPrism
	 *
	 *@return a - returns the value it's calculated for the base area
	 */
	@Override
	public double calculateBaseArea() {
		double a = 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2);
		return a;
	}
	
	/**
	 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
	 * 
	 * This method calculates the volume for the octagonalprism
	 * 
	 * @return baseArea - returns the calculated baseArea
	 */

	@Override
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return baseArea * height;
	}

	@Override
	public String toString() {
		return "OctagonalPrism [sideLength=" + sideLength + ", height=" + height + ", BaseArea="
				+ calculateBaseArea() + ", Volume=" + calculateVolume() + "]";
	}
	
}
