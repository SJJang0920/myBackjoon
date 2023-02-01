import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numarr = new int[9];
		for(int i = 0; i<9; i++) {
			numarr[i] = Integer.parseInt(br.readLine()); 
		}
		int max = numarr[0];
		int mxn = 1;
		for(int i = 1; i<9; i++) {
			if(max < numarr[i]) {
				max = numarr[i];
				mxn = i+1;
			}
		}
		bw.write(max+"\n");
		bw.write(mxn+"");
		bw.flush();
		bw.close();
	}
}
