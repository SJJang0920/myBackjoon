import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		int five = N/5;
		int three = 0;
		if((N%5)==1) {
			five--;
			three = 2;
		}else if((N%5)==2) {
			five -= 2;
			three = 4;
		}else if((N%5)==4){
			five -= 1;
			three = 3;
		}else {
			three = (N%5)/3;
		}
		ans = five + three;
		if(five<0) {
			ans = -1;
		}
		bw.write(ans+"");
		bw.flush();
		bw.close();
	}
		
}