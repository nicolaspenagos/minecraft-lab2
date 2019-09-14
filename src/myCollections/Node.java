package myCollections;

public class Node<M> {

//	private Node<M> next;
	private Node<M> prev;
	private M element; 
	
	public Node(M ele) {
		element = ele;
	}
//	public void setNext(Node<M> ne) {
//		next = ne;
//	}
//	public Node<M> getNext() {
//		return next;
//	}
	public M getElement() {
		return element;
	}
	public void setElement(M element) {
		this.element = element;
	}
	public Node<M> getPrev() {
		return prev;
	}
	public void setPrev(Node<M> prev) {
		this.prev = prev;
	}
}
