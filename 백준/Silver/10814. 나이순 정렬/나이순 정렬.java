import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[][] list = new String[N][2];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list[i][0] = st.nextToken();
			list[i][1] = st.nextToken();
		}
		Arrays.sort(list, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0].equals(o2[0])) {
					return 0;
				}else {
					return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);	
				}
				
			}
		});
		for(int i=0;i<N;i++) {
			bw.write(list[i][0]+" "+list[i][1]+"\n");
		}
		bw.flush();
		bw.close();
	}
}