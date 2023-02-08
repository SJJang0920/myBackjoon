import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<Integer>();
		if(M<=2) {
			bw.write("2\n");
		}
		list.add(2);
		for(int i = 3; i<=N; i += 2) {
				for(int j=0; ; j++) {
					if(i%list.get(j)==0) {
						break;
					}
					if(list.get(j) > i/list.get(j)) {
						list.add(i);
						if(i>=M) {
							bw.write(i+"\n");
						}
						break;
					}
				}
		}
		bw.flush();
		bw.close();
	}
}