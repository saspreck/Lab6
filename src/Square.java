
public class Square extends Rectangle {
	
	/**
	 * Constructor for the square, sets size
	 * and puts it into the array list
	 * 
	 * @param size, the side length of the square
	 */
	public Square(String id, double size) {
		super(id, size, size);
	}
	
	/**
	 * Gets the shape type of the square
	 * 
	 * @return the string "Square"
	 */
	public String getShapeType() {
		return "Square";
	}

}
