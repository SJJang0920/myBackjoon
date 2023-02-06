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
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());
		long day = 0;
		if(V==A){
			day = 1;
		}else if((V-A)<(A-B)){
			day = 2;
		}else if((V-A)%(A-B)==0) {
			day = (V-A)/(A-B) + 1;
		}else {
			day = (V-A)/(A-B) + 2;
		}
		
		bw.write(day+"");
		bw.flush();
		bw.close();
	}
}