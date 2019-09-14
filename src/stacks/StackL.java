package stacks;

public class StackL <M> implements StackI<M> {

	private Node<M> top;
	
	public StackL() {
		
	}
	@Override
	public M pop() {
		M ele;
		if(!empty()) {
			ele = top.getElement();
			Node<M> newTop = top.getPrev();
			top.setPrev(null);
			top = newTop;
		}
		else {
			ele = null;
		}
		return ele;
	}

	@Override
	public M look() {
		return top.getElement();
	}

	@Override
	public boolean empty() {
		boolean empty = false;
		if(top == null) {
			empty = true;
		}
		return empty;
	}

	@Override
	public boolean push(Node<M> a) {
		Node<M> temp = top;
		top = a;
		top.setPrev(temp);
		return true;
	}

}
