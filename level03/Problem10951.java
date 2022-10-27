package myBackjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10951 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}	
			String[] resultarr = line.split(" ");
			System.out.println(Integer.parseInt(resultarr[0])+Integer.parseInt(resultarr[1]));			
		}	
	}
}
