import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		People granddad = new People("paths\\granddad\\Q.txt");
		Reader reader = new Reader();
		granddad.argument(reader);
		People mum = new People("paths\\mum\\Q.txt");
		mum.argument(reader);
	}
	
}
