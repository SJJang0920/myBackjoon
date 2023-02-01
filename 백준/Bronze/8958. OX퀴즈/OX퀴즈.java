import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String ox = "";
		int count = 0;
		int point = 0;
		for(int i = 0; i< num; i++) {
			ox = br.readLine();
			point = 0;
			count = 0;
			for(int j = 0; j<ox.length(); j++) {
				if(ox.charAt(j)=='O') {
					count++;
					point += count;
				}else {
					count = 0;
				}
			}
			bw.write(point+"\n");
		}
		bw.flush();
		bw.close();
	}
}