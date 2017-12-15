import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Reader reader = new Reader();
		
		People mum = new People("paths\\mum\\Q.txt");
		mum.argument(reader);
		
		printWhitespace();
		
		People granddad = new People("paths\\granddad\\Q.txt");
		granddad.argument(reader);
	}
	
	public static void printWhitespace() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
	
}
