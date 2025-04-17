package package_1;

public class QueueX {
	
	private int maxSize;
	char[] charArray;
	private int rear;
	private int front;
	private int nItems;
	
	public QueueX(int size) {
		this.maxSize = size;
		this.charArray = new char[maxSize];
		this.rear = -1;
		this.nItems = 0;
		this.front = 0;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return rear == maxSize - 1;
	}
	
	public void insert(char j) {
		if(isFull()) {
			System.out.println("Queue is full");
		} else {
			charArray[++rear] = j;
			nItems++;
		}
			
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return '0';
		} else {
			nItems--;
			return charArray[front++];	
		}
			
	}
}
