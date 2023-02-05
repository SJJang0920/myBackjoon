import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int row = 1;
		int col = 1;
		int sum = 3;
		boolean state = true;
		while(n>1) {
			if(state) {
				col = sum-row;
				n--;
				if(n==1) {
					break;
				}
				row++;
			}else {
				row = sum-col;
				n--;
				if(n==1) {
					break;
				}
				col++;
			}
			if(state && col==1) {
				state = false;
				sum++;
			}else if(!state && row==1) {
				state = true;
				sum++;
			}
		}
		bw.write(row+"/"+col);
		bw.flush();
		bw.close();
	}
}