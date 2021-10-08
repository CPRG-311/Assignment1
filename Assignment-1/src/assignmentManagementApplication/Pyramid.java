package assignmentManagementApplication;

public class Pyramid extends Shape {
	double sideLength;
	
	public Pyramid(double height, double edgeLength) {
		super();
		super.height = height;
		this.sideLength = edgeLength;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
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

	@Override
	public String toString() {
		return "Pyramid [sideLength=" + sideLength + ", height=" + height + ", BaseArea="
				+ calculateBaseArea() + ", Volume=" + calculateVolume() + "]";
	}
	
	
}
