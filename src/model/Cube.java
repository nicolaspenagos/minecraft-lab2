package model;

public class Cube {

	private String path;
	private String key;
	private Cube next;
	
	public Cube(String p, String k) {
		path = p;
		key = k;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public Cube getNext() {
		return next;
	}

	public void setNext(Cube next) {
		this.next = next;
	}
}
