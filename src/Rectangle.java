
public class Rectangle extends Polygon {
	private double height;
	private double width;
	
	/**
	 * Constructor for the rectangle, sets height and width
	 * and puts them into the array list
	 * 
	 * @param height, the height of the rectangle
	 * @param width, the width of the rectangle
	 */
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
		sideLengths.add(height);
		sideLengths.add(height);
		sideLengths.add(width);
		sideLengths.add(width);
	}
	
	/**
	 * Get the area of the rectangle
	 * 
	 * @return the area of the rectangle
	 */
	@Override
	public double getArea() {
		return height * width;
	}
	
	/**
	 * Gets the shape type of the triangle
	 * 
	 * @return the string "Rectangle"
	 */
	@Override
	public String getShapeType() {
		return "Rectangle";
	}
	

}
