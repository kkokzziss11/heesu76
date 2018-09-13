package 종합실습과제;
import java.util.Scanner;
public class 문제14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a;
		a=sc.nextInt();
		
		switch(a) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:System.out.println(a+"월의 마지막 날은 31일입니다.");
		break;
		case 2:System.out.println(a+"월의 마지막 날은 28일입니다");
		break;
		default:System.out.println(a+"월의 마지막날은 31일입니다");
		}

	}

}
