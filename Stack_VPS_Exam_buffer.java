package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_VPS_Exam_buffer {
	public static String checkVPS(String data) {
		String result = "";
		char[] dataArr = data.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		try {
			for(int i=0; i<dataArr.length; i++) {
				switch(dataArr[i]) {
					case '(':
						stack.push('(');
						break;
					case ')':
						stack.pop();
						break;
					default :					
				}
			}
			if(stack.empty()) {
				result = "YES";
			}else {
				result = "NO";
			}		
		}catch(Exception e){
			result = "NO";
		}	
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String count = br.readLine();
		for (int i = 0; i <Integer.parseInt(count); i++) {
		String data = br.readLine();
		System.out.println(checkVPS(data));
		}	
	}
}
