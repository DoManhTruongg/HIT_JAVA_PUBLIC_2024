package Bai3;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);
		int c = (int) (Math.random() * 21);
		int sum = a + b;
		boolean check = (sum == c);
		boolean ty_le = Math.random() < 0.5;
		if (ty_le) {
			c = sum;
		} else {
			c = (c == sum) ? (c + 1) % 21 : c;
		}
		System.out.println(a + " + " + b + " = " + c);
		System.out.print("Phép toán đúng hay sai(Y/N): ");
		String nhap = Sc.nextLine().trim().toUpperCase();
		if (nhap.equals("Y") && ty_le || nhap.equals("N") && !ty_le) {
			System.out.println("chính xác");
		} else {
			System.out.println("ko chính xác");
		}

	}
}