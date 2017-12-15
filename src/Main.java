import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Reader reader = new Reader();
		
		System.out.println("you are a QA consultant returning home for Christmas. \n you must run the gauntlet of familial conversation and interaction. \n Be careful how you respond your words could have dire consequences");
		
		People mum = new People("paths\\mum\\Q.txt");
		mum.argument(reader);
		
		printWhitespace();
		
		People granddad = new People("paths\\granddad\\Q.txt");
		granddad.argument(reader);
		
		System.out.println("");
	}
	
	public static void printWhitespace() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
	
}
