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
		list.add(2);
		for(int i = 3; i<=10000; i += 2) {
			for(int j=0; ; j++) {
				if(i%list.get(j)==0) {
					break;
				}
				if(list.get(j) > i/list.get(j)) {
					list.add(i);
					break;
				}
			}
		}
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			int a = n/2;
			int b = n/2;
			while(true) {
				if(list.contains(a) && list.contains(b)) {
					bw.write(a+" "+b+"\n");
					break;
				}else {
					a--;
					b++;
				}
			}
			
		}
		bw.flush();
		bw.close();
	}
}