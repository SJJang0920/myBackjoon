import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		for(int i=0;i<N;i++) {
			String word = br.readLine();
			if(!list.contains(word)) {
				list.add(word);	
			}
		}
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					int i = 0;
					while(o1.charAt(i)==o2.charAt(i)) {
						i++;
					}
					return o1.charAt(i) - o2.charAt(i);
				}else {
					return o1.length() - o2.length();
				}
			}
		});
		
		for(int i=0;i<list.size();i++) {
			bw.write(list.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}
}