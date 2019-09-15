package myCollections;

public class StackA {

	public final static int MAX_STACK = 576;
	private Object[] items;
	private int top;

	public StackA() {

		items = new Object[MAX_STACK];
		top = -1;

	}

	public boolean isEmpty() {

		return top < 0;
	}

	public boolean push(Object toPush, int y) {
		int currentSize = size();
		if (size() <= MAX_STACK) {
			if(currentSize + y<= MAX_STACK) {
				for (int i = 0; i < y; i++) {
					top++;
					items[top] = toPush;
				}
			}else {
				int i =  MAX_STACK-currentSize;
				for (int j = 0; j < i; j++) {
					top++;
					items[top] = toPush;
				}
			}
			
			return true;
		}else {
			return false;
		}

	}

	public Object pop() {

		Object toPop = null;

		if (!isEmpty()) {

			toPop = items[top];
			items[top] = null;
			top--;

		}

		return toPop;

	}

	public Object top() {
		Object itemsTop = null;

		if (!isEmpty()) {
			itemsTop = items[top];
		}

		return itemsTop;
	}

//	public boolean search(Object toSearch) {
//
//		boolean found = false;
//
//		int cont = 0;
//		while (cont < top) {
//
//			Object current = items[cont];
//			if (toSearch.equals(current)) {
//				found = true;
//			}
//
//			cont++;
//		}
//
//		return found;
//
//	}

	public int size() {
		int size = 0;

		if (0 <= top) {
			size = top + 1;
		}

		return size;
	}

}
