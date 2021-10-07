package assignmentManagementApplication;

import java.util.Comparator;

public class BaseAreaCompare implements Comparator<Shape> {

	public BaseAreaCompare(){
		
	}
	
	@Override
	public int compare(Shape o1, Shape o2) {
		double area1 = o1.calculateBaseArea();
		double area2 = o2.calculateBaseArea();
		if (area1 > area2) {
			return 1;
		}
		else if (area1 < area2) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
