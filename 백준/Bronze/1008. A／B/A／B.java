import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		System.out.println(Double.parseDouble(data.split(" ")[0])/Double.parseDouble(data.split(" ")[1]));
	}
}
