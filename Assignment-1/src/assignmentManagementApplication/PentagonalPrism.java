package assignmentManagementApplication;

public class PentagonalPrism extends Prism {

	public PentagonalPrism(double height, double side) {
		super();
		super.height = height;
		super.sideLength = side;
	}

	@Override
	public double calculateBaseArea() {
		double numerator = 5 * Math.pow(sideLength, 2) * Math.tan(Math.toRadians(54));
		return numerator / 4;
	}

	@Override
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return baseArea * height;
	}
	
}
