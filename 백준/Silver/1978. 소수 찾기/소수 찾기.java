import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0;
		for(int i = 0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a==2){
				ans++;
			}else {
				for(int j = 2; j<a;j++) {
					if(a%j==0) {
						break;
					}
					if(j==a-1) {
						ans++;
					}
				}
			}
		}
		bw.write(ans+"\n");
		bw.flush();
		bw.close();
	}
}