package myBackjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1920 {
	public static int binarysearch(int[] num1,int num2) {
		int result = 0;
		int startIndex = 0;
		int endIndex=num1.length-1; 
		int middleIndex;
		while(startIndex<=endIndex) {
			middleIndex = (startIndex+endIndex)/2;
			if(num1[middleIndex]==num2) {
				result = 1;
				break;
			}else if(num1[middleIndex]>num2) {
				endIndex = middleIndex-1;
			}else {
				startIndex = middleIndex+1;
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String Aarr[] = br.readLine().split(" ");
		int[] Narr = new int[N];
		for(int i=0; i<N; i++) {
			Narr[i] = Integer.parseInt(Aarr[i]);
		}
		Arrays.sort(Narr);	
		
		int M = Integer.parseInt(br.readLine());
		String Barr[] = br.readLine().split(" ");
		int[] Marr = new int[M];
		for(int i=0; i<M; i++) {
			Marr[i] = Integer.parseInt(Barr[i]);
		}	
		for(int i=0; i<M; i++) {	
			System.out.println(binarysearch(Narr,Marr[i]));
		}
	}

}
