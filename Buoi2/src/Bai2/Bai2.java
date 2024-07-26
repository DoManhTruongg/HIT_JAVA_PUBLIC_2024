package Bai2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Nhập n= ");
		int n = Sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i) {
			System.out.print("a[" + i + "]= ");
			a[i] = Sc.nextInt();
		}
		for (int i = 1; i < n; ++i) {
			if (i % 2 == 1) {
				int L = (i - 1 >= 0) ? a[i - 1] : 0;
				int R = (i + 1 < n) ? a[i + 1] : 0;
				a[i] += Math.abs(R - L);
			}
		}
		for (int i = 0; i < n; ++i) {
			System.out.print(a[i] + " ");
		}
	}

}
