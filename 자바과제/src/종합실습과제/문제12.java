package 종합실습과제;
import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a, b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		int f=a+b/2;
		if((f>=60)&&(a>=40)&&(b>=40)) {
			System.out.println("합격");}
		else if((f>=60)&&(a<40||b<40)) {
				System.out.println("불합격(과락)");
				
			}
		else {
				System.out.println("불합격(과락)");
			}
		}

}


