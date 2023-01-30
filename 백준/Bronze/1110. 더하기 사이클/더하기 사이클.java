import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		int i=0;
		
		if(Integer.parseInt(a)<10) {
			a = "0"+a;
		}
		String b = a;
		while(true) {
			int b1 = Integer.parseInt(b)/10;
			int b2 = Integer.parseInt(b)%10;
			int b3 = (b1+b2)%10;
			b = b2+""+b3;
			i++;
			if(b.equals(a+"")) {
				break;
			}
		}
		bw.write(i+"");
		bw.flush();
		bw.close();
	}
}