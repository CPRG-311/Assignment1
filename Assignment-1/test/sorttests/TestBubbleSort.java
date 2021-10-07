package sorttests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import assignmentManagementApplication.*;
import utilities.BubbleSort;

public class TestBubbleSort {
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
		BubbleSort.sort(testArray, new VolumeCompare());
		System.out.println("After: ");
		for (Shape s: testArray) {
			System.out.printf("%.3f ,", s.calculateVolume());
		}
	}

}
