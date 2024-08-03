package Bai1;

import java.util.Scanner;

public class BUoi3 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String Square = new String("square");
		String Triangle = new String("triangle");
		String Circle = new String("circle");
		String dang = Sc.nextLine();

		if (dang.equals(Square)) {
			int a = Sc.nextInt();
			double dientich = Math.pow(a, 2);
			System.out.print(dientich);
		} else if (dang.equals(Triangle)) {
			int a = Sc.nextInt();
			int b = Sc.nextInt();
			int c = Sc.nextInt();
			if (a + b < c || a + c < b || b + c < a) {
				System.out.print("-1");
			} else {
				int perimeter = a + b + c;
				double dientich = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
				System.out.printf("%.2f", dientich);
			}
		} else if (dang.equals(Circle)) {
			double radius = Sc.nextDouble();
			double dientich = Math.PI * Math.pow(radius, 2);
			System.out.printf("%.2f", dientich);
		} else {
			System.out.print("nhập dạng sai");
		}
	}

}
