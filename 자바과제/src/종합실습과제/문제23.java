package 종합실습과제;

public class 문제23 {
	public static void main(String[]args) {
		int g=0;
		int sum=0;
		for(int i=1;i<=1000;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
				g+=1;
			}
		}
		System.out.println(g+" ");
		System.out.println(sum+" ");
		
		
		
	}

}
