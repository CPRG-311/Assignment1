package assignmentManagementApplication;

public class OctagonalPrism extends Prism implements Calculations{
	
	public OctagonalPrism(double height, double side) {
		super.height = height;
		super.sideLength = side;
	}

	@Override
	public double calculateBaseArea() {
		double a = 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2);
		return a;
	}

	@Override
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return baseArea * height;
	}
	
}
