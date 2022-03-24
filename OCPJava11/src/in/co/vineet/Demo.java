package in.co.vineet;

public class Demo {

	public static void main(String[] args) {
		// TODO Implement this Method
		
		Demo d = new Demo();
		d.printName("Vineet");
		
		// int[] numbers = new int[] {101, 2, 5, 78};
		int  numbers [    	] = {101, 2, 5, 78};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
	}
	
	public void printName(String name) {
		
		// Use String Builder Class to form the Welcome Message
		StringBuilder sb = new StringBuilder("Hello & Welcome ");
		sb.append(name);	
		sb.append(" ...");
		System.out.println(sb.toString());
	}

}
