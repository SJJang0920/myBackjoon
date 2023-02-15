import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int[] arr = new int[N];
		int[] check = new int[8001];
		for(int i=0;i<N;i++) {
			arr[i]= Integer.parseInt(br.readLine());
			sum += arr[i];
			check[arr[i]+4000]++;
		}
		Arrays.sort(arr); //정렬
		int mid = arr[N/2];  //중간값
		int range = arr[N-1]-arr[0]; //범위
		int lot = 0; //최빈값;
		int maxcheck = 0;
		int[] val = new int[3];
		boolean state = true;
		for(int i=0; i<8001; i++) {		
			if(check[i]>maxcheck && check[i] != 0) {
				maxcheck = check[i];
				val[0] = i-4000;
				state = true;
			}else if(check[i]==maxcheck && check[i] != 0) {
				if(state == true) {
					val[1] = i-4000;
				}
				state = false;
			}
		}
		if(state) {
			lot = val[0];	
		}else {
			lot = val[1];
		}
		
		bw.write(Math.round((1.0*sum)/N)+"\n");
		bw.write(mid+"\n");
		bw.write(lot+"\n");
		bw.write(range+"\n");
		bw.flush();
		bw.close();
	}
}