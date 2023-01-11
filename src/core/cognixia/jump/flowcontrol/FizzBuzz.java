package core.cognixia.jump.flowcontrol;

public class FizzBuzz {

	public static void main(String[] args) {
		printFizzBuzz(20);
 
	}
	
	public static void printFizzBuzz(int n) {
		for(int i = 1; i <= n; i++) {
			
	    if(isPrime(i)) {
	    	//System.out.println("prime" + i);
	    	continue;
	    }
	    	else if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}  else {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPrime(int num) {
		boolean result = true;
		
		if(num <= 1) {
			return result = false;
		}
		else {
			for(int i = 2; i <= num / 2; i++) {
				if(num % i == 0) {
					result = false;
					break;
				}
			}
			return result;
		}
		
	}

}
