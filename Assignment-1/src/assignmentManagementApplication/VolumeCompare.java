package assignmentManagementApplication;

import java.util.Comparator;

public class VolumeCompare implements Comparator<Shape> {

	public VolumeCompare(){
		
	}
	@Override
	public int compare(Shape o1, Shape o2) {
		double vol1 = o1.calculateVolume();
		double vol2 = o2.calculateVolume();
		if (vol1 > vol2) {
			return 1;
		}
		else if (vol1 < vol2) {
			return -1;
		}
		else {
			return 0;	
		}	
	}
}
