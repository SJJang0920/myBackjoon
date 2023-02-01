import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i< 10; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = a%42; 
			if(!list.contains(b)) {
				list.add(b);
			}
		}
		bw.write(list.size()+"\n");
		bw.flush();
		bw.close();
	}
}