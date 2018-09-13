package 종합실습과제;
import java.util.Scanner;
public class 문제05 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.printf("%2d시간 %2d분 %2d초",a/3600,a/60%60,a%60);
		
		

	}

}
