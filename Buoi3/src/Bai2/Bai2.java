package Bai2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String nhapchuoi = Sc.nextLine();
		if (doixung(nhapchuoi)) {
			String viethoa = nhapchuoi.toUpperCase();
			System.out.print(viethoa);
		} else {
			String vietthg = nhapchuoi.toLowerCase();
			System.out.print(vietthg);
		}
	}

	public static boolean doixung(String nhapchuoi) {
		String cleanedString = nhapchuoi.replaceAll("\\s+", "").toLowerCase();
		int left = 0;
		int right = cleanedString.length() - 1;
		while (left < right) {
			if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
