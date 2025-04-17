package package_1;
import java.util.Scanner;

public class StackApp {
	public static void main (String[] args) {
		
		Scanner scObj = new Scanner(System.in);
		
		QueueX theQueue = new QueueX(10);
		StackX theStack = new StackX(10);
		
		//add values to the queue
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Enter the Character : ");
			char character = scObj.nextLine().charAt(0);
			
			theQueue.insert(character);
		}
		 		
		//add values to the stack
		while(!theQueue.isEmpty()) {
			theStack.push(theQueue.remove());
		}
	
			
		//store values in the queue with descending order
		while(!theStack.isEmpty()) {
			theQueue.insert(theStack.pop());
		}
		
		
		System.out.print("Decending Order = ");
		while(!theQueue.isEmpty()) {
			
			System.out.print(theQueue.remove() + " ");
		} 
		
		
	}
}
