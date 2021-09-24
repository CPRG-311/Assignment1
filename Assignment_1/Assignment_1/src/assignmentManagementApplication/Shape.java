package assignmentManagementApplication;

import java.util.Comparator;


public class Shape implements Comparable, Comparator{
	String shapeName;
	double number1;
	double number2;
	
	//we dont want to include the shape name in the object, were creating the objects
	// as their subclass and type casting them after to be held in Shape 
	public Shape(Double number1, Double number2) {		
		number1 = this.number1;
		number2 = this.number2;
		
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	
	

}
