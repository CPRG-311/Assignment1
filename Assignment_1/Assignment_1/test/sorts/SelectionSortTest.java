package sorts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import assignmentManagementApplication.*;
import utilities.SelectionSort;

public class SelectionSortTest {
	static Shape[] array;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		array = new Shape[]{(Shape)new Cone(22,32), (Shape)new Cylinder(10,21), (Shape)new Cone(3,5), 
				(Shape)new Pyramid(45,32), (Shape)new Cone(13,19)};
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		array = null;
	}

	@Test
	public void test() {
		SelectionSort.sortHeight(array);
		for (Shape x : array) {
			System.out.println(x.getHeight());
		}
		//test using array to see if it comes out sorted correctly
		//this should be the sorted array
		//{ (Shape)new Cone(3,5),(Shape)new Cylinder(10,21),(Shape)new Cone(13,19),(Shape)new Cone(22,32),(Shape)new Pyramid(45,32)}
		fail("Not yet implemented");
	}

}
