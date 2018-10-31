
public class mainStackGeneric {

	public static void main(String[] args) {
		// 
		double[] doubleElements = {1.1,2.2,3.3,4.4,5.5,6.6};
		int[] integerElements = {1,2,3,4,5,6,7,8,9,10,11};
		
		StackGeneric<Double> doubleStack = new StackGeneric<Double>(5);
		StackGeneric<Integer> integerStack = new StackGeneric<Integer>(10);
		
		//test push Double
		try {
			
			System.out.println("PUSH ELEMENTS ONTO DOUBLESTACK");
			
			for (double element : doubleElements) {
				System.out.printf("if", element);
				doubleStack.push(element);
			}
			
		}catch (FullStackException fullStackException) {
			System.err.println();
			fullStackException.printStackTrace();
		}
		
		//test pop double
		
		try {
			System.out.println("pop element from doubleStack");
			
			double popValue;
			
			while (true) {
				
				popValue = doubleStack.pop(); //pop from double stack
				System.out.printf("if", popValue);
			}
		}catch (EmptyStackException emptyStackException) {
			System.err.println();
			emptyStackException.printStackTrace();
			
		}
		//test push method with Integer stack
		
		try {
			System.out.println("push element onto integerStack");
			
			
			for(int element : integerElements) {
				System.out.printf("%d",element);
				
				integerStack.push(element);
			}
		}catch (FullStackException fullStackException) {
			System.err.println();
			fullStackException.printStackTrace();
		}
		//test pop method
		try {
			System.out.println("pop element from integerStack");
			
			int popValue; //store element
			
			while (true) {
				
				popValue = integerStack.pop(); //pop from double stack
				System.out.printf("if", popValue);
			}
		}catch (EmptyStackException emptyStackException) {
			System.err.println();
			emptyStackException.printStackTrace();
			
		}
		
		


	}

}

