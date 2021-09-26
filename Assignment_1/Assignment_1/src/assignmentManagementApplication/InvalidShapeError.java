package assignmentManagementApplication;

public class InvalidShapeError extends Exception {
	String message = "Shape entered is not valid, shape Skipped.";
	
	public void printMessage() {
		System.out.println(message);
	}
}
