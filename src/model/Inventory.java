package model;
import myCollections.HashTable;

public class Inventory {
	
	private String currentBlock;
	private int currentAmount;
	private HashTable ht;
	
	public Inventory() {
		ht = new HashTable();
	}
	
	public String getCurrentBlock() {
		return currentBlock;
	}
	
	public int getCurrentAmount() {
		return currentAmount;
	}
	
	public void generateRandomBlock() {
		
		currentAmount = (int)(Math.random()*64)+1;
		currentBlock = "block"+((int)(Math.random()*27));
		System.out.println(currentBlock);
	}
	public boolean add(Cube c) {
		return ht.add(c);
		
	}
	
	public HashTable getTable() {
		return ht;
	}

}