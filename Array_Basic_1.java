package java_programs;

public class Array_Basic_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,41,65,78,98};
		for(int i=0;i<5;i++)
		{
			System.out.println("value is "+a[i]);
		}
		String[] names= {"harish","raunak","riya","kanak"};
		System.out.println(names[1]);
		for(String name:names)
		{
			System.out.println(name);
		}

	}

}
