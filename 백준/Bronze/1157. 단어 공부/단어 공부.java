import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine().toUpperCase();
		String ans = "";
		int check = 0;
		int maxcount = 0;
		for(int i = 'A'; i<='Z'; i++) {
			int count = 0;
			if(word.contains(String.valueOf((char)i))){
				for(int j = 0; j<word.length(); j++) {
					if(word.charAt(j)==i) {
						count++;
					}
				}	
				if(maxcount<count) {
					maxcount = count;
					ans = String.valueOf((char)i);
					check = 0;
				}else if (maxcount == count) {
					check++;
				}
			}
		}
		if(check!=0) {
			bw.write("?");
		}else {
			bw.write(ans);	
		}
		bw.flush();
		bw.close();
	}
}