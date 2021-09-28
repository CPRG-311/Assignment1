package assignmentManagementApplication;

import java.util.Comparator;


public abstract class Shape implements Comparable<Shape>{
	double height;
	public abstract double calculateBaseArea();
	public abstract double calculateVolume();
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

	@Override
	public int compareTo(Shape o) {
		if (this.height > (o.height)) {
			return 1;
		}
		else if (this.height == o.height) {
			return 0;
		} else {
			return -1;
		}
	}





}
