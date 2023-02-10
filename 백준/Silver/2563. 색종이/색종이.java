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
		int num = Integer.parseInt(br.readLine());
		int[][] page = new int[100][100];
		for(int n=0; n<num;n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int i=x;i<x+10;i++) {
				for(int j=y;j<y+10;j++) {
					page[i][j]=1;
				}
			}
		}
		int ans = 0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(page[i][j]==1) {
					ans++;
				}
			}
		}
		bw.write(ans+"");
		bw.flush();
		bw.close();
	}
}