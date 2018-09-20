package 종합실습과제;

import java.util.Scanner;

public class 문제11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");

		int x1, y1, z1, x2, y2, z2;

		System.out.println("원(x1,y1,z1):");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		z1 = sc.nextInt();
		sc.nextLine();

		System.out.println("원(x2,y2,z2):");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		z2 = sc.nextInt();

		int d1 = (int) Math.pow(x2 - (x1), 2);
		int d2 = (int) Math.pow(y2 - (y1), 2);
		int r = (int) Math.pow(z2 - (z1), 2);
	    int d = d1 + d2;
		if (d <= r)
			System.out.println("판정 : 겹침");
		else if (d == r)
			System.out.println("판정: 접함");
		else
			System.out.println("판정:겹치지않음");
	}

}



