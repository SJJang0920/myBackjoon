import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numarr = new int[st.countTokens()];
		int i = 0;
		while(st.hasMoreTokens()) {
			numarr[i] = (Integer.parseInt(st.nextToken()));
			i++;
		}
		Arrays.sort(numarr);
		int a = numarr[0];
		int b = numarr[1];
		int c = numarr[2];
		if(a==b) {
			if(b==c) {
				System.out.println(10000+a*1000);
			}else {
				System.out.println(1000+a*100);
			}
		}else if(b==c) {
			System.out.println(1000+b*100);
		}else {
			System.out.println(c*100);
		}
	}
}
