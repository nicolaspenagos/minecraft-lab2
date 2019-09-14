package stacks;

public interface StackI<M> {

	public boolean push(Node<M> a); 
	public M pop();
	public M look();
	public boolean empty();
	
}
