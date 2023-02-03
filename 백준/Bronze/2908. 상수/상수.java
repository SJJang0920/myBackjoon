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
		String a = st.nextToken();
		String b = st.nextToken();
		String ra = "";
		String rb = "";
		String ans = "";
		for(int i=0; i<3; i++) {
			ra = a.charAt(i)+ra;
			rb = b.charAt(i)+rb;
		}
		if(Integer.parseInt(ra)>Integer.parseInt(rb)) {
			ans = ra;
		}else {
			ans = rb;
		}
		bw.write(ans);
		bw.flush();
		bw.close();
	}
}