package test;

public class ChangeTest {
	public static void changeStringBuffer(StringBuffer ss1,StringBuffer ss2)//传递的是地址
	{
		ss1.append("World");
		ss2=ss1;//将ss1的地址赋给ss2,对于实参来说没有什么影响
	}
	public static void main(String args[]){
		Integer a=1;
		Integer b=a;
		b++;
		System.out.println(a);
		System.out.println(b);
		StringBuffer s1=new StringBuffer("Hello");
		StringBuffer s2=new StringBuffer("Hello");
		changeStringBuffer(s1,s2);
		System.out.println(s1);
		System.out.println(s2);
	}
}

