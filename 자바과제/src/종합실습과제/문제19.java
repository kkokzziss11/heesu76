package 종합실습과제;

public class 문제19 {
	public static void main(String[]args) { 
	int a=0;
	System.out.print("1-2+3-4+5-6+7-8+9-10=");
	for(int i=1;i<=10;i++) {
		if(i%2==0) a-=i;
		else a+=i;
		
				
		
	}
	System.out.println(a);

	
	}
}
