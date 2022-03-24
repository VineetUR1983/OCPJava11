package in.co.vineet;

public class Demo {

	public static void main(String[] args) {
		// TODO Implement this Method
		
		Demo d = new Demo();
		d.printName("Vineet");
		
	}
	
	public void printName(String name) {
		
		// Use String Builder Class to form the Welcome Message
		StringBuilder sb = new StringBuilder("Hello & Welcome ");
		sb.append(name);	
		sb.append(" ...");
		System.out.println(sb.toString());
	}

}
