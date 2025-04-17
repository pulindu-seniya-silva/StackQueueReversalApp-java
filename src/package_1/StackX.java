package package_1;

public class StackX {
	
	private int maxSize;
	char[] charArray;
	private int top; 
	
	public StackX(int size) {
		
		maxSize = size;
		charArray = new char[maxSize];
		top = -1;
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("Stack is Full");
		} else 
			charArray[++top] = j;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '0';
		} else {
			return charArray[top--];
		}
	}
	
}
