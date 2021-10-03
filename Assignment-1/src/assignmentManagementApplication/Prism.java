package assignmentManagementApplication;

public abstract class Prism extends Shape {
	double sideLength;
	
	public double getSideLength() {
		return sideLength;
	}
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	public abstract double calculateBaseArea();
	public abstract double calculateVolume();
}
