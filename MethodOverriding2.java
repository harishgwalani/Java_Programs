package java_programs;

public class MethodOverriding2 {
	int s;
	public void sum(int a,int b)
	{
		s=a+b;
		System.out.println("sum is all"+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding2 m=new MethodOverriding2();
		m.sum(2,5);
	}

}
