import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = N;
		for(int i = M; i<=N; i++) {
			for(int j = 2; j<=i;j++) {
				if(i%j==0 && i!=2) {
					break;
				}
				if(j==i-1 || i==2) {
					sum += i;
					if(min>i) {
						min = i;
					}
				}
			}
		}
		if(sum!=0) {
			bw.write(sum+"\n");
			bw.write(min+"\n");	
		}else {
			bw.write("-1");
		}
		
		bw.flush();
		bw.close();
	}
}