package 종합실습과제;

import java.util.Scanner;

public class 문제13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		if (a.charAt(3) == '1')
			System.out.println("총무부");
		else if (a.charAt(3) == '2')
			System.out.println("인사부");
		else
			System.out.println("영업부");

	}

}
