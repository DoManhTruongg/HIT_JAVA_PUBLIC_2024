package Bai1;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		double r;
		do{
			System.out.print("Nhập r = ");
			r = Sc.nextDouble();
			if(r<0||r>1000) {
				System.out.print("quá điều kiện của r nhập lại.\n");
			}
		}
		while(r<0||r>1000);
		System.out.println("Chu vi hình tròn là: " + 2*3.14*r);
		System.out.print("diện tích hình tròn là: "+ 3.14*r*r);
	}
}
