package stack;

import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		int[] arr = {5,6,5};
		if(arr.length>=2) {
			if(arr[0]==10 || arr[arr.length-1]==10) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
	}
}


