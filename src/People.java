import java.io.IOException;
import java.util.Scanner;

public class People {
	Scanner scanner;
	Reader reader;
	String filePath;
	
	public People(String folderPath) {
		scanner = new Scanner(System.in);
		this.filePath = folderPath;
	}
	
	public void argument(Reader reader) throws IOException {
		String option = "stuff";
		boolean giveOptions = reader.readFile(this.filePath);
		while(!option.equals("a") && !option.equals("b") && !option.equals("c") && giveOptions) {
			System.out.print("Pick your option: ");
			option = scanner.nextLine();
			if(option.equals("a")) {
				this.filePath = filePath.substring(0, filePath.length() - 4) + "A.txt";
				argument(reader);
			} else if(option.equals("b")) {
				this.filePath = filePath.substring(0, filePath.length() - 4) + "B.txt";
				argument(reader);
			} else if(option.equals("c")) {
				this.filePath = filePath.substring(0, filePath.length() - 4) + "C.txt";
				argument(reader);
			} else {
				System.out.println("Please enter \"a\", \"b\", or \"c\".");
			}
		}
	}
}
