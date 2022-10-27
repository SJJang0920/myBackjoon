package myBackjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2164 {
	public static int cheak(int num) {
		Queue<Integer> queue = new LinkedList<Integer>(); 
		for(int i=1; i<=num; i++) {
			queue.add(i);
		}
		while(queue.size()>1) {  
			queue.poll();
			queue.add(queue.poll());	
		}
		return queue.peek();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(cheak(num));
	}

}
