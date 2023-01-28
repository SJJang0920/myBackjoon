import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int sum(int[] args) {
		return (args[0]+args[1])%args[2];
		
	}
	public static int product(int[] args) {
		return (args[0]*args[1])%args[2];
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		System.out.println(sum(new int[] {A,B,C}));
		System.out.println(sum(new int[] {A%C,B%C,C}));
		System.out.println(product(new int[] {A,B,C}));
		System.out.println(product(new int[] {A%C,B%C,C}));
	}

}
