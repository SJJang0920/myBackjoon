import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	static int count = 0;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		bw.write((int)Math.pow(2, N)-1+"\n");
		hanoi(N,1,2,3);
		
		bw.flush();
		bw.close();
	}
	public static void hanoi(int N,int s,int m, int d) throws IOException {
		if(N!=1) {
			hanoi(N-1,s,d,m);
		}
		bw.write(s+" "+d+"\n");
		count++;
		if(N!=1) {
			hanoi(N-1,m,s,d);
		}
		
	}
}