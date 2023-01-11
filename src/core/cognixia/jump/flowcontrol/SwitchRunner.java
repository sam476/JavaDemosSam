package core.cognixia.jump.flowcontrol;

public class SwitchRunner {

	public static void main(String[] args) {
		int condition = 1; 
//		int condition = 2;
//		int condition = 3;
//		int condition = 4;
//		int condition = 5;
//		int condition = 6;
//		int condition = 7;
//		int condition = 8;
//		int condition = 9;
		//the condition of the switch can be an int, char, string, enum
		switch(condition) {
		case 1:
			System.out.println("You will see this only if condition is 1");
			break;
		case 2: 
			System.out.println("2");
		case 3:
			System.out.println("3");
		default:
			System.out.println("no match");
			break;
		}

	}

}
