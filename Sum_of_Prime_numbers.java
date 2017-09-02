package stack;

import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		boolean flag = false;
		int count = 0;
		int sum = 0;
		int n = 2;
		while(count<100) {
			flag = false;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}
			} 
			if (flag == false) {
				sum = sum + n;
				count++;
				System.out.println(n);
			} 
			n++;
			
		}
		System.out.println(sum);
		
	}

}

