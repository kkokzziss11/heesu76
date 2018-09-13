package 종합실습과제;
import java.util.Scanner;
public class 문제07 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		sc.useDelimiter("\r|\n|,");
		
		System.out.println("a AND b:"+(a&b));
		System.out.println("a OR b:"+(a|b));
		System.out.println("NOT a:"+ ~a);
		System.out.println("a XOR b:"+(a^b));
		System.out.println("a NAND b:"+~(a&b));
		System.out.println("a NOR b:"+~(a|b));

	}

}
