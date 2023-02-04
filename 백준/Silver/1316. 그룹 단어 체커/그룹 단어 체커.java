import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int ans = 0;
		for(int i=0; i<count; i++) {
			String word = br.readLine();
			String checkword = "";
			for(int j=0; j<word.length();j++) {
				if(j>=1) {
					if(word.charAt(j)==word.charAt(j-1)) {
						checkword = checkword + word.charAt(j);
						continue;
					}else {
						if(word.indexOf(word.charAt(j))<j){
							break;
						}else {
							checkword = checkword + word.charAt(j);
						}
					}
				}else {
					checkword = checkword + word.charAt(j);
				}
			}
			if(word.equals(checkword)) {
				ans++;
			}
		}
		bw.write(ans+"");
		bw.flush();
		bw.close();
	}
}