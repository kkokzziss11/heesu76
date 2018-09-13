package 종합실습과제;
import java.util.Scanner;
public class 문제03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float c=sc.nextFloat();
		
		System.out.println("섭씨온도:"+c);
		System.out.printf("화씨온도:%.2f도",(c*1.8)+32);
		
	}

}
