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
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		int[][] A = new int[row][col];
		int[][] B = new int[row][col];
		int[][] ans = new int[row][col];
		for(int i=0;i<row;i++) {
			StringTokenizer a = new StringTokenizer(br.readLine());
			for(int j=0;j<col;j++) {
				A[i][j] = Integer.parseInt(a.nextToken());
			}
		}
		for(int i=0;i<row;i++) {
			StringTokenizer b = new StringTokenizer(br.readLine());
			for(int j=0;j<col;j++) {
				B[i][j] = Integer.parseInt(b.nextToken());
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				ans[i][j] = A[i][j]+B[i][j];
				bw.write(ans[i][j]+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}