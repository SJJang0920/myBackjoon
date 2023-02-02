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
		int num = Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++){
			if(Test.hansu(i)) {
				list.add(i);
			}
		}
		bw.write(list.size()+"");
		bw.flush();
		bw.close();
	}
}

class Test {
	static boolean hansu(int num) {
		int a = num%10;
		int b = (num%100)/10;
		int c = num/100;
		if(num<100) {
			return true;
		}else {
			if(c-b == b-a) {
				return true;
			}else {
				return false;
			}
		}
		
	}
}