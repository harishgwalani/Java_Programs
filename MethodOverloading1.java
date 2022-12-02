package java_programs;

public class MethodOverloading1 {
	int s;
public void sum(int a,int b)
{
	s=a+b;
	System.out.println("sum is "+s);
}
public void sum(int a,int b,int c)
{
	s=a+b+c;
	System.out.println("sum is "+s);
}
}
