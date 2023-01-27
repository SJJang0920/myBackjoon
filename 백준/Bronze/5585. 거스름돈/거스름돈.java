import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		int money = 1000-pay;
		int count = 0;
		int[] coinType = {500,100,50,10,5,1};
		
		for (int i = 0; i < coinType.length; i++) {
			count = count + money/coinType[i];
			money = money%coinType[i];
		}
		System.out.println(count);
	}
}
