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
		int count = 0;
		int i = 0;
		while(n>0) {
			if(i==0) {
				n -= 1;
			}else {
				n = n - 6*i;
			}
			i++;
			count++;
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}