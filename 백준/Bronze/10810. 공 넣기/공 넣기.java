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
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		for(int a=0; a<M; a++) {
			StringTokenizer ijk = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(ijk.nextToken());
			int j = Integer.parseInt(ijk.nextToken());
			int k = Integer.parseInt(ijk.nextToken());
			play(arr, i,j,k);
		}
		for(int ans : arr) {
			bw.write(ans+" ");
		}
		bw.flush();
		bw.close();
	}
	
	public static void play(int[] arr, int i,int j, int k) {
		for(int a = i-1; a<=j-1; a++) {
			arr[a] = k;
		}
	}
}