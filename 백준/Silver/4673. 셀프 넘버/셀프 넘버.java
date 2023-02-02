import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<Integer>();
		int i = 1;
		while(i<10000) {
			int num = i;
			while(num<10000) {
				num = Test.self(num);
				if(!list.contains(num)) {
					list.add(num);
				}else {
					break;
				}
			}
			i++;
		}
		for(int j = 1; j<10000; j++) {
			if(!list.contains(j)) {
				bw.write(j+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}

class Test {
	static int self(int num) {
		int a = num%10;
		int b = (num%100)/10;
		int c = (num%1000)/100;
		int d = num/1000;
		return num+a+b+c+d;
	}
}