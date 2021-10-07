package sorttests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import assignmentManagementApplication.BaseAreaCompare;
import assignmentManagementApplication.Cone;
import assignmentManagementApplication.Cylinder;
import assignmentManagementApplication.OctagonalPrism;
import assignmentManagementApplication.PentagonalPrism;
import assignmentManagementApplication.Pyramid;
import assignmentManagementApplication.Shape;
import assignmentManagementApplication.VolumeCompare;
import utilities.BubbleSort;
import utilities.InsertionSort;
import utilities.SelectionSort;

public class TestInsertionSort {
	static Shape[] testArray;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testArray = new Shape[]{(Shape)new Cone(4,5),(Shape)new Pyramid(6,10),(Shape) new Cylinder(10,3),
				(Shape)new PentagonalPrism(3,9),(Shape)new Cone(3,2), (Shape)new OctagonalPrism(3,10)};
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		testArray = null;
	}

	@Test
	public void test() {
		System.out.println("Before: ");
		for (Shape s: testArray) {
			System.out.printf("%.3f ,", s.calculateVolume());
		}
		InsertionSort.sort(testArray, testArray.length, new VolumeCompare());
		System.out.println("After: ");
		for (Shape s: testArray) {
			System.out.printf("%.3f ,", s.calculateVolume());
		}
		System.out.println();
		System.out.println("\nBefore using area: ");
		for (Shape s: testArray) {
			System.out.printf("%.3f ,", s.calculateBaseArea());
		}
		SelectionSort.sort(testArray, new BaseAreaCompare());
		System.out.println("After using area: ");
		for (Shape s: testArray) {
			System.out.printf("%.3f ,", s.calculateBaseArea());
		}
		System.out.println();
		System.out.println("\nBefore using height: ");
		for (Shape s: testArray) {
			System.out.printf("%.3f ,", s.getHeight());
		}
		SelectionSort.sort(testArray,null);
		System.out.println("After using height: ");
		for (Shape s: testArray) {
			System.out.printf("%.3f ,", s.getHeight());
		}
		System.out.println();
	}

}
