
public class App {

	public static void main(String[] args) {
		
		//inefficient
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		//More efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		////// Formatting ///////////////////////////////////
	
		// Formatting Integers
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for (int i = 0; i<20; i++) {
			System.out.printf("%2d: %s\n", i, "Here is some text");
		}
		
		// Formatting floating point numbers
		System.out.printf("Total value %.2f\n", 5.6585);
		System.out.printf("Total value %7.1f\n", 5214.6585);

	}

}
