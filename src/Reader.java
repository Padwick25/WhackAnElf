import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public boolean readFile(String extension) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(extension));  
		String str;  
		while((str = br.readLine()) != null){  
			if(str.equals("quit")) {
				return false;
			}
		    System.out.println(str);
		}
		return true;
	}
}
