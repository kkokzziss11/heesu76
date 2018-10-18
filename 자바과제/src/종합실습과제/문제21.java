package 종합실습과제;
import java.util.Scanner;
public class 문제21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		int sum=0;
		int x = 0;
		for(int i=1;i<=a;i++) {
			
			sum+=i*i;
			
		}
		
		System.out.println(""+sum);
		
	}

}
