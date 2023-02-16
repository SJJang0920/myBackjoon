import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		bw.write(fn(N)+"");
		bw.flush();
		bw.close();
	}
	public static int fn(int n) {
		if(n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}else {
			return fn(n-2)+fn(n-1);
		}
	}
}