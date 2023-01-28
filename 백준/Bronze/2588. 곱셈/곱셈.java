import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int product(int a, int b) {
		return a*b;
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		System.out.println(product(A,B%10));
		System.out.println(product(A,(B%100-B%10))/10);
		System.out.println(product(A,B/100));
		System.out.println(product(A,B));
	}

}
