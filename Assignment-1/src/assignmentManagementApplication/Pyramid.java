package assignmentManagementApplication;

public class Pyramid extends Shape {
	double sideLength;
	
	public Pyramid(double height, double edgeLength) {
		super();
		super.height = height;
		this.sideLength = edgeLength;
	}

	@Override
	public double calculateBaseArea() {
		return Math.pow(sideLength,2);
	}

	@Override
	public double calculateVolume() {
		double baseArea = this.calculateBaseArea();
		return (1.0/3) * height * baseArea;
	}
}
