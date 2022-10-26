package basic;

import java.util.Scanner;
import java.util.Stack;

public class MyStackIronBarTestBuffer {
	public static int checkVPS(String data) {
		int result = 0;
		Stack<Character> stack = new Stack<Character>();
		char[] dataArr = data.toCharArray();
		for(int i=0; i<data.length();i++){
			if(dataArr[i]=='(') {
				if(dataArr[i+1]=='(') {
					stack.push('c');
				}else {
					result = result + stack.size();
					i++;
				}
			}
			else {
				stack.pop();
				result = result + 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		System.out.println(checkVPS(data));		
			

	}

}
