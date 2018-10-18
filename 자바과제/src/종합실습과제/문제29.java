package 종합실습과제;
import java.util.Scanner;


public class 문제29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=0;
		for(int i=1;i<=a;i++) 
		{
			if(a%i==0&&b%i==0&&c%i==0)
			{
				max=i;
			}
		}
		System.out.printf("최대공약수:%d",max);
	}
}


