package assignmentManagementApplication;

public class TriangularPrism extends Prism {
	public TriangularPrism(double height, double side) {
		super();
		super.height = height;
		super.sideLength = side;
	}

	@Override
	public double calculateBaseArea() {
		double numerator = Math.pow(sideLength, 2) * Math.sqrt(3);
		return numerator / 4;
	}

	@Override
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return baseArea * height;
	}

	@Override
	public String toString() {
		return "TriangularPrism [sideLength=" + sideLength + ", height=" + height + ", BaseArea="
				+ calculateBaseArea() + ", Volume=" + calculateVolume() + "]";
	}
	
}
