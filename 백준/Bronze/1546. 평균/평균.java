import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i< num; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		double sum = 0;
		
		for(int i = 0; i< num; i++) {
			sum = sum + (list.get(i)*100.0/list.get(num-1));
		}
		bw.write(sum/num+"\n");
		bw.flush();
		bw.close();
	}
}