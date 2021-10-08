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


	@Override
	public String toString() {
		return "SquarePrism [sideLength=" + sideLength + ", height=" + height + ", BaseArea="
				+ calculateBaseArea() + ", Volume=" + calculateVolume() + "]";
	}
	
	
}
