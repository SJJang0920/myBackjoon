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
		for(int i = 0; i< num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int people = Integer.parseInt(st.nextToken());
			int[] point = new int[people];
			double sum = 0.0;
			double avg;
			for(int j = 0; j<people; j++){
				point[j] = Integer.parseInt(st.nextToken());
				sum = sum+ point[j];
			}
			avg = sum/people;
			int count = 0;
			for(int j = 0; j<people; j++){
				if(point[j]>avg) {
					count++;
				}
			}
			double ans = Math.round(count*100000.0/people)/1000.0;
			bw.write(String.format("%.3f",ans)+"%\n");
		}
		bw.flush();
		bw.close();
	}
}