import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		int ans = 0;
		for(int i=0; i<word.length(); i++) { 
			if(word.charAt(i)=='=' || word.charAt(i)=='-') { 
				if(word.charAt(i-1)=='z') {
					if(i>=2) {
						if(word.charAt(i-2)=='d') {
							ans--;
						}
					}
				}
				continue;
			}else if(word.charAt(i)=='j') {
				if(i>=1) {
					if(word.charAt(i-1)=='l' || word.charAt(i-1)=='n') {
						continue;
					}
				}
				ans++;
			}else {
				ans++;
			}
		}
		bw.write(ans+"");
		bw.flush();
		bw.close();
	}
}