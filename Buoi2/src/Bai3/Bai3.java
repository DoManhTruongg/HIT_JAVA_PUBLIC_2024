package Bai3;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Nhập n= ");
		int n = Sc.nextInt();
		int a[][] = new int[n][n];
		int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
		int dem = 1;
		while (h1 <= h2 && c1 <= c2) {
			for (int i = c1; i <= c2; i++) {
				a[h1][i] = dem;
				dem++;
			}
			++h1;
			for (int i = h1; i <= h2; i++) {
				a[i][c2] = dem;
				dem++;
			}
			--c2;
			for (int i = c2; i >= c1; i--) {
				a[h2][i] = dem;
				dem++;
			}
			--h2;
			for (int i = h2; i >= h1; i--) {
				a[i][c1] = dem;
				dem++;
			}
			++c1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}

	}
}
