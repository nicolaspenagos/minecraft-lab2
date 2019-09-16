package modelTest;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import model.Cube;

public class CubeTest {

	private Cube c;
	private String path;
	private String key;
	
	public void setupScenary1() {
		path = "Path";
		key = "block1";
	}
	
	@Test
	public void testCube() {
		setupScenary1();
		c = new Cube(path, key);
		assertTrue("Not creating the object", c != null);
		assertTrue("Not the corresponding attribute", c.getPath().equalsIgnoreCase( "Path"));
		assertTrue("Not the corresponding attribute", c.getKey().equalsIgnoreCase( "block1"));
		assertTrue("The next cube is not null", c.getNext() == null);
		c.setNext(c);
		assertTrue("The next is still null", c != null && c.getNext().equals(c));
		c.setKey("New Key");
		c.setPath("New Path");
		assertTrue("Not assigning the values correctly", c.getKey().equalsIgnoreCase("new key")&& c.getPath().equalsIgnoreCase("new path"));
	}

}
