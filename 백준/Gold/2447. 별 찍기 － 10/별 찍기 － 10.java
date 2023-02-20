import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	static String[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		arr = new String[N][N];
		star(N,0,0,false);
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				bw.write(arr[i][j]+"");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	public static void star(int N,int x, int y, boolean blank) {
		if(blank) {	
			for(int i = x; i < x + N; i++) {
				for(int j = y; j < y + N; j++) {
					arr[i][j] = " ";
				}
			}
			return;
		}
		if(N == 1) {
			arr[x][y] = "*";
			return;
		}
		int size = N/3;
		int count = 0;
		for(int i = x; i < x + N; i += size) {
			for(int j = y; j < y + N; j += size) {
				count++;
				if(count == 5) {	
					star(size, i, j, true);
				}
				else {
					star(size, i, j, false);
				}
			}
		}
	}
	
}