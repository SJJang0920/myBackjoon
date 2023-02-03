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
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			String answer = "";
			for(int j = 0; j<word.length(); j++) {
				for(int k = 0; k<count; k++) {
					answer = answer + word.charAt(j); 
				}
			}
			bw.write(answer+"\n");
		}
		bw.flush();
		bw.close();
	}
}