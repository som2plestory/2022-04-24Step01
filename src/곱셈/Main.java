package 곱셈;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int b100 = b/100;
		int b10 = b/10-(b100)*10;
		int b1 = b-(b100)*100-(b10)*10;
		
		System.out.println(a*b1);
		System.out.println(a*b10);
		System.out.println(a*b100);
		System.out.println(a*b);
		
		sc.close();
	}
}
