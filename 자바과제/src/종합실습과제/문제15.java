package 종합실습과제;
import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		int b=a/10;
		
		switch(b) {
		case 10: case 9:System.out.println("A");
		break;
		case 8:System.out.println("B");
		break;
		case 7:System.out.println("C");
		break;
		case 6:System.out.println("D");
		break;
		default:System.out.println("E");
		}

	}

}
