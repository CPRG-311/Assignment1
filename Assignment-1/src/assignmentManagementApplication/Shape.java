package assignmentManagementApplication;

/**
 * @author Ashley Drinkill, Gia Hoa (Tom) Hyugen, Kolby Robertson, Ethan Wright
 * This is the abstract base class for all Shapes, every shape extended by this class has at 
 * minimum the following attributes:
 * 	height
 * 	a base area
 * 	a volume
 * No shapes can be created using this class
 */
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

	
	/**
	 * This method overrides the Comparable method compareTo, and compares Shape objects 
	 * strictly by their height
	 */
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
