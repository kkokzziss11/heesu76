package _03객체지향언어의특징_다형성;

public class Main  {

	public static void main(String[] args) {
		new Test1();
		Test1 t1=new Test1(); 
		t1.print(1, 1);
		t1.print(1, "1");
		t1.print("1", 1);
		t1.print("1", "1");
		t1.bark();
		
		Test2 t2=new Test2();
		t2.bark();
		
		

	}

}
