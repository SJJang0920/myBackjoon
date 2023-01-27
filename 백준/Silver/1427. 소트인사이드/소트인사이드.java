import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			String num = key.nextLine();
			int size = num.length();
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = num.charAt(i);
			}
			for(int i=0;i<size;i++) {
				int maxIndex=i;
				for(int j=i+1;j<size;j++) {
					if(arr[maxIndex]<arr[j]) {
						maxIndex=j;
					}
				}
				int tmp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = tmp;
			}
			display(arr);
		}
		public static void display(int[] myarr) {
			int size = myarr.length;
			for (int i = 0; i < size; i++) {
				System.out.print((char)myarr[i]);
			}
			System.out.println();
		}

}

