import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//int x = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(b>=45) {
			b -= 45;
		}else {
			if(a>0) {
				a -= 1;
				
			}
			else {
				a = 23;
			}
			b = b+15;
		}
		System.out.println(a+" "+b);
	}

}
