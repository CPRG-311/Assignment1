package assignmentManagementApplication;

public class Pyramid extends Shape implements Calculations{
	double height;
	double sideLength;
	
	public Pyramid(double height, double edgeLength) {
		this.height = height;
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
