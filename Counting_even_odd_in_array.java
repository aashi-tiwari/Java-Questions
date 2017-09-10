package stack;

import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		int[] a = { 1, 2, 4, 6, 7, 9, 12, 45, 89, 110, 145, 222, 55, 66, 33 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if(a[i] % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}

		}
		System.out.println("even: "+even);
		System.out.println("odd: "+odd);

	}

}
