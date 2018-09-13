package 종합실습과제;
import java.util.Scanner;
public class 문제08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		sc.useDelimiter("\r|\n|,");
		
		System.out.println("정수:"+a);
		System.out.println("절댓값:"+((a>0)?a:-a));

	}

}
