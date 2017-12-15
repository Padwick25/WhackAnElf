import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		People mum = new People("paths\\Mum\\mumQ.txt");
		Reader reader = new Reader();
		mum.argument(reader);
	}
	
}
