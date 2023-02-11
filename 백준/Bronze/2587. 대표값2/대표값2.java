import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		bw.write(sum/5+"\n");
		bw.write(arr[2]+"\n");
		bw.flush();
		bw.close();
	}
}