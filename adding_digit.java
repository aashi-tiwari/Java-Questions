package stack;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		int num = 999992;
		int sum = 0;
		int r;
		while( num > 0 ) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		System.out.println(sum);

	}

}
