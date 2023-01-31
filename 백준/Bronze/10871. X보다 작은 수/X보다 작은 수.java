import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nx = br.readLine().split(" ");
		String[] num = br.readLine().split(" ");
		for(int i = 0; i< Integer.parseInt(nx[0]); i++) {
			if(Integer.parseInt(nx[1])>Integer.parseInt(num[i])) {
				bw.write(num[i]);
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
	}
}
