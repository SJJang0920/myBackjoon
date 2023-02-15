import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] ans = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			ans[i] = arr[i];
			
		}
		Arrays.sort(ans);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int j=0;
		for(int i=0;i<N;i++) {
			if(!map.containsKey(ans[i])) {
				map.put(ans[i], j);
				j++;
			}
		}
		for(int i=0;i<N;i++) {
			bw.write(map.get(arr[i])+" ");
		}
		
		bw.flush();
		bw.close();
	}
}