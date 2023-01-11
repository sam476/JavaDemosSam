package core.cognixia.jump.flowcontrol;

public class WhileLoopRunner {

	public static void main(String[] args) {
		
//		runWhile();
//		runBooleanWhile();
		
		// basic for loop 
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		boolean condition = true;
		for(int i = 1;condition; i *= 5) {
			if(i % 3 == 0) {
			   condition = false;
			}
			System.out.println(i);
		}

	}
	
	public static void runWhile() {
		// init counter 
		int counter = 1; 
		// declaring the condition for the while loop 
		// the loop will continue until this is met 
		while(counter < 10) {
			System.out.println(counter);
			counter++;
		}
	}
	
	public static void runBooleanWhile() {
		boolean condition1 = true; 
		int counter = 1;
		
		while(condition1) {
			System.out.println(counter);
			counter++;
			if(counter > 10) {
				condition1 = false;
			}
		}
	}

}
