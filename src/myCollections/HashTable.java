package myCollections;

import model.Cube;

public class HashTable implements HashTableI {

	private final static int SIZE = 27;
	private Cube[] table;

	public HashTable(){
		table = new Cube[SIZE];
	}

	@Override
	public boolean add(Cube c) {
		boolean could = true;
		int counter = 1;
		int pos = hash(c.getKey());
		if(table[pos] == null) {
			table[pos] = c;	
		}
		else {
			boolean added = false;
			Cube actual = 	table[pos]; 
			while(!added && counter <= 64) {
				if(actual.getNext() == null) {
					actual.setNext(c);
					added = true;
				} else {
					actual = actual.getNext();
				}
			}
			if(added == false) {
				could = false;
			}
		}
		return could;
	}

	@Override
	public int hash(String key) {
		String[] parts = key.split("k");
		return Integer.parseInt(parts[1]);
	}




}