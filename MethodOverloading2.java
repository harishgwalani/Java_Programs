package java_programs;

public class MethodOverloading2 extends MethodOverloading1 {
public void sum()
{
	int s=1;
	System.out.println("sum is "+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading2 m = new MethodOverloading2();
		m.sum();
		m.sum(2, 3);
		m.sum(2, 3, 4);
	}

}
