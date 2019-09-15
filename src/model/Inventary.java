package model;
import myCollections.HashTable;
import myCollections.StackL;

public class Inventary {
	
	private String currentBlock;
	private int currentAmount;
	private HashTable ht;
	
	public Inventary() {
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
		currentBlock = "block"+((int)(Math.random()*4));
		System.out.println(currentBlock);
	}
	public boolean add(Cube c) {
		return ht.add(c);
		
	}
	
	public HashTable getTable() {
		return ht;
	}

}