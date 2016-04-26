package  com.briup.eg1;

public class Test
{
	public static void main(String [] args)
	{
	Student zhangsan=new Student();
	zhangsan.name="张三";
	zhangsan.sayHello();
	int sum=0;
	for(int i=0;i<50;i++)
	  { 
           	sum=sum+i;
			System.out.println(i);
			System.out.print(sum+"   ");
			
	  }
	}
}

