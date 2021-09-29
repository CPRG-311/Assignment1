package assignmentManagementApplication;

public class SquarePrism extends Prism {
	
	public SquarePrism(double height, double side) {
		super();
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
