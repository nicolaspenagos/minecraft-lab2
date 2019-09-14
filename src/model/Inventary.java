package model;

import myCollections.StackL;

public class Inventary {
	
	private String currentBlock;
	private int currentAmount;
	private StackL<Integer> a;
	
	public Inventary() {
		
	}
	
	public String getCurrentBlock() {
		return currentBlock;
	}
	
	public int getCurrentAmount() {
		return currentAmount;
	}
	
	public void generateRandomBlock() {
		
		currentAmount = (int)(Math.random()*64)+1;
		currentBlock = "block"+((int)(Math.random()*15)+1);
		System.out.println(currentBlock);
	
		
	}

}