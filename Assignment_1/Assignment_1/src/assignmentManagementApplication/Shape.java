package assignmentManagementApplication;

import java.util.Comparator;


public class Shape implements Comparable, Comparator{
	String shapeName;
	double number1;
	double number2;
	
	public Shape (String shapeName, Double number1, Double number2) {
		
		
		shapeName = this.shapeName;
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
