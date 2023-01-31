import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		int max = Integer.parseInt(num[0]);
		int min = Integer.parseInt(num[0]);
		for(int i = 0; i<n; i++) {
			if(max<Integer.parseInt(num[i])) {
				max = Integer.parseInt(num[i]);
			}
			if(min>Integer.parseInt(num[i])) {
				min = Integer.parseInt(num[i]);
			}
		}
		bw.write(min+" "+max);
		
		bw.flush();
		bw.close();
	}
}