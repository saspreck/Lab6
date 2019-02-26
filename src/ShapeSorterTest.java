import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 4, 6); //area 24, perimeter 20
		Shape b = new EquilateralTriangle("test2", 4); //area 6.9282, perimeter 12
		Shape c = new Rectangle("test3", 2, 12); //area 24, perimeter 28
		Shape d = new Circle("test4", 1.5); //area 7.069, perimeter 9.4248

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), d);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), c);
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 4, 6); //area 24, perimeter 20
		Shape b = new EquilateralTriangle("test2", 4); //area 6.9282, perimeter 12
		Shape c = new Rectangle("test3", 2, 12); //area 24, perimeter 28
		Shape d = new Circle("test4", 1.5); //area 7.069, perimeter 9.4248

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		ShapeAreaComparator sc = new ShapeAreaComparator();
		sorter.sortShapes(sc);
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), d);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), c);
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 4, 6); //area 24, perimeter 20
		Shape b = new EquilateralTriangle("test2", 4); //area 6.9282, perimeter 12
		Shape c = new Rectangle("test3", 2, 12); //area 24, perimeter 28
		Shape d = new Circle("test4", 1.5); //area 7.069, perimeter 9.4248

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		ShapePerimeterComparator sc = new ShapePerimeterComparator();
		sorter.sortShapes(sc);
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), d);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), c);
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape sqr = new Square("Square1", 4.0);
		Shape cir = new Circle("Circle1", 4.0);
		
		sorter.addShape(sqr);
		sorter.addShape(cir);
		
		Assert.assertEquals("Shape toString incorrect.", "Square:\t ID = Square1\t area = 16.000\t perimeter = 16.000"
				+ "Circle:\t ID = Circle1\t area = 50.265\t perimeter = 25.133", 
				sorter.toString());

	}
}
