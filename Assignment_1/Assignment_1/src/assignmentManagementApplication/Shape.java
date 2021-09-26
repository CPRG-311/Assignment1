package assignmentManagementApplication;

import java.util.Comparator;


public abstract class Shape implements Comparable, Comparator{
	double height;
	public abstract double calculateBaseArea();
	public abstract double calculateVolume();

	@Override
	public int compare(Object o1, Object o2) {
		
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		
		return 0;
	}





}
