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
		int n = 0;
		while((n = Integer.parseInt(br.readLine())) != 0) {
			List<Integer> list = new ArrayList<Integer>();
			int count = 0;
			list.add(2);
			if(n==1) {
				count ++;
			}
			for(int i = 3; i<=2*n; i += 2) {
					for(int j=0; ; j++) {
						if(i%list.get(j)==0) {
							break;
						}
						if(list.get(j) > i/list.get(j)) {
							list.add(i);
							if(i>n && i<=2*n) {
								count++;
							}
							break;
						}
					}
			}
			bw.write(count+"\n");
		}
		bw.flush();
		bw.close();
	}
}