public class QueueGeneric<E> {
	
		private final int size;
		private int top;
		private E[] elements;
		
		public QueueGeneric() {
			this(10);
			
		}
		public QueueGeneric(int s) {
			
			size = s >0 ? s :10;
			top= -1;
			
			elements = (E[]) new Object[size]; //creat array
		}
		public void push (E pushValue) {
			
			if(top == size - 1) // if stack full
				throw new FullStackException(String.format("Stack is full, cannot push", pushValue));
			
			elements[++top] = pushValue; //place push value
		}
		
		public E pop() {
			if (top== -1) //if stack empty
				throw new EmptyStackException("stack is empty, cannot pop");
			return  elements[top--];//remove and return top elements of stack
		}

}
class EmptyStackException extends RuntimeException {
	
	public EmptyStackException() {
		this("stack is empty");
	}
	public EmptyStackException(String Exception) {
		super(Exception);
	}
}

class FullStackException extends RuntimeException {
	
	public FullStackException() {
		this("stack is full");
	}
	public FullStackException(String Exception) {
		super(Exception);
	}
}
