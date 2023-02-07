import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int ans = live(k,n);
			bw.write(ans+"\n");
		}
		bw.flush();
		bw.close();
		}
		
		public static int live(int k, int n) {
			int ans = 0;
			if(k==0) {
				for(int i = 1; i<=n; i++) {
					ans = i;
				}
			}else {
				k--;
				for(int i = 1; i<=n; i++) {
					ans += live(k,i);
				}
			}
			return ans; 
		}
}