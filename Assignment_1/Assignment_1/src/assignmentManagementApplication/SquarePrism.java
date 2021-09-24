package assignmentManagementApplication;

public class SquarePrism extends Prism implements Calculations {
	
	public SquarePrism(double height, double side) {
		super.height = height; 
		super.sideLength = side;
	}

	@Override
	public double calculateBaseArea() {
		return Math.pow(sideLength, 2);
	}

	@Override
	public double calculateVolume() {
		return Math.pow(sideLength, 2) * height;
	}
}
