package stack;

import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		int[] a = { 1, 2, 6, 7, 8, 9, 10, 11, 19, 20 };
		int[] b = new int[a.length];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == 10) {
				break;
			} else {

				b[i] = a[i];
				System.out.println(b[i]);
			}

		}
		
	}

}
