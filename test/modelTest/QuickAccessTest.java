package modelTest;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import model.Cube;
import model.QuickAccess;
class QuickAccessTest {
	
	private QuickAccess qA;
	private Cube c;
	
	public void setUpScenary1() {
		qA = new QuickAccess();
	}
	
	public void setUpScenary2() {
		qA = new QuickAccess();
		c = new Cube("/images/block10","block10");
	}
	
	@Test
	void quickAccessTest() {
		
		setUpScenary1();
		assertTrue("The constructor is not working", qA != null);
		
	}
	
	@Test 
	void addTest() {
		
		setUpScenary2();
		assertTrue("The add method is not working porperly", qA.add(c, 10, 5));
		
	}
	
	@Test 
	void numberOfImagesTest() {
		
		setUpScenary2();
		qA.add(c, 1, 100);
		assertTrue("Number of images is not correct", qA.numberOfImages(1)==2);
		qA.add(c, 1, 400);
		assertTrue("Number of images is not correct", qA.numberOfImages(1)==8);
		qA.add(c, 2, 15);
		assertTrue("Number of images is not correct", qA.numberOfImages(2)==1);
		
	}
	
	@Test
	void residueTest() {
		
		setUpScenary2();
		qA.add(c, 1, 100);
		assertTrue("The residue is not correct", qA.residue(1)==36);
		qA.add(c, 1, 28);
		assertTrue("The residue is not correct", qA.residue(1)== 0);
		
	}
	
	@Test
	void getPathTest() {
		
		setUpScenary2();
		qA.add(c, 1, 100);
		assertTrue("The path is not correct", qA.getPath(1).equals("/images/block10"));
		
	}
	
	@Test
	void getkeyTest() {
		
		setUpScenary2();
		qA.add(c, 1, 100);
		assertTrue("The key is not correct", qA.getCurrentKey(1).equals("block10"));
		
	}
	
	@Test
	void isNullTest() {
		
		setUpScenary2();
		assertTrue("The method is not correct", qA.isNull(1));
		qA.add(c, 1, 100);
		assertTrue("The method is not correct", !qA.isNull(1));
	}

}
