package 종합실습과제;
import java.util.Scanner;
public class 문제22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int g=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.printf(i+" ");
				g+=1;
			}
			
		}
		System.out.println("약수의 갯수:"+g);
		
		

	}

}
