package modelTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.Inventory;
import model.Cube;

class InventoryTest {

	private Inventory inv;
	private Cube c;
	
	public void setUpScenary1() {
		inv = new Inventory();
	}
	
	public void setUpScenary2() {
		inv = new Inventory();
		c = new Cube("/images/block10","block10");
	}
	
	@Test
	void InventoryTest() {
		
		setUpScenary1();
		assertTrue("The constructor is not working porperly", inv != null);
		
	}
	
	@Test
	void gettersTest() {
		
		setUpScenary1();
		setUpScenary2();
		
		assertTrue("The getter is not working properly", inv.getCurrentBlock() == null && inv.getCurrentAmount() == 0);
		inv.generateRandomBlock();
		assertTrue("The getter is not working properly", inv.getCurrentBlock() != null && inv.getCurrentAmount() != 0);
	}
	
	
	@Test
	void generateRandomBlockTest() {
		
		setUpScenary1();
		
		inv.generateRandomBlock();
		int x = inv.getCurrentAmount();
		String y = inv.getCurrentBlock();
		
		inv.generateRandomBlock();
		int z = inv.getCurrentAmount();
		String w = inv.getCurrentBlock();
		
		inv.generateRandomBlock();
		int h = inv.getCurrentAmount();
		String k = inv.getCurrentBlock();
		
		assertTrue("Generate Random number is not working", h!= 0 && z !=0 && x != 0);
		assertTrue("Generate Random String not working", k!= null && w != null && y != null);
		
	}
	
	@Test
	void addTest() {
		
		setUpScenary1();
		setUpScenary2();
		
		assertTrue("Add method is not working properly", inv.add(c));
		
	}

}
