package 제03차시;

public class 실습05 {

	public static void main(String[] args) {
		
		//1차원 배열의 예
		int a[];
		a=new int [5];
		a[0]=10;
		a[1]=15;
		a[2]=20;
		a[3]=23;
		a[4]=35;
		
		//2차원 배열의 예
		int b[][]= 
		{
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
				
		};
		
		System.out.println("배열a[]의크기 : "+a.length);
		System.out.println("배열b[][]의크기 : "+b.length);
		System.out.println("배열b[1]의크기 : "+b.length);

	}

}
