package model;

import myCollections.StackA;

public class QuickAccess {

	private StackA[] quickA;
	private int[] sizes; 

	public QuickAccess() {
		quickA = new StackA[28];
		sizes = new int[28];
		for (int i = 0; i < quickA.length; i++) {
			quickA[i] = new StackA(); 
		}

	}

	public boolean add(Cube c, int x, int y) {
		boolean could;
		Object cc = c;
		could = quickA[x].push(cc,y);
		sizes[x] = quickA[x].size();

		return could;

	}
	
	public int numberOfImages(int y) {
		
		int x = sizes[y]/64;
		
		if(sizes[y] % 64 != 0)
			x++;
		
		return x;
	}
	
	public int residue(int y) {
		
		int x = sizes[y]%64;
		System.out.println("x "+x);
		return x;
	}
	
	public String getPath(int y) {
		Cube c = (Cube)quickA[y].top();
		return c.getPath();
	}
	
	public boolean isNull(int y) {
		Cube c = (Cube)quickA[y].top();
		if(c==null)
			return true;
		else 
			return false;
	}
	
	public String getCurrentKey(int y) {
		Cube c = (Cube)quickA[y].top();
		return c.getKey();
	}


}
