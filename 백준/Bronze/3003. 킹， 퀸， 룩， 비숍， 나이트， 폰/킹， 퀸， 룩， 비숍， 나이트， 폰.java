import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] chess = {1, 1, 2, 2, 2, 8};
		for(int i=0;i<6; i++) {
			System.out.print(chess[i]-Integer.parseInt(input[i]));
			if(i!=5) {
				System.out.print(" ");
			}
		}
	}

}
