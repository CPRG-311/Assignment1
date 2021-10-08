package assignmentManagementApplication;

public class PentagonalPrism extends Prism {
	
	/**
	 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
	 * 
	 * This method takes in the values from shape for the height and side for pentagonal prism,
	 * Is also using super to assign the values of height and side from the parent which is shape.
	 * 
	 * 
	 * 
	 * @param height - this value contains the height of the pentagonal prism retreved from the shape class.
	 * @param side - this parameter contains the value for the side length of the pentagonal prism.
	 */

	public PentagonalPrism(double height, double side) {
		super();
		super.height = height;
		super.sideLength = side;
	}
	
	/**
	 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
	 * 
	 * This method calculates the base area for the pentagonal prism and returns the calculated base based on the length and height.
	 * 
	 * @return numerator - returns the calculated base area for the pentagonal prism
	 */

	@Override
	public double calculateBaseArea() {
		double numerator = 5 * Math.pow(sideLength, 2) * Math.tan(Math.toRadians(54));
		return numerator / 4;
	}
	
	/**
	 * @author Ethan Wright,Gia Hoa (Tom) Nguyen, Ashley Drinkill, Kolby Robertson
	 * 
	 * This method calculates the volume for the pentagonal prism and returns the calculated volume.
	 * 
	 * @return baseArea - returns the base area multiplied by the height
	 */

	@Override
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return baseArea * height;
	}

	@Override
	public String toString() {
		return "PentagonalPrism [sideLength=" + sideLength + ", height=" + height + ", BaseArea="
				+ calculateBaseArea() + ", Volume=" + calculateVolume() + "]";
	}
}
