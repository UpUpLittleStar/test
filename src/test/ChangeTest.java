package test;

public class ChangeTest {
	public static void changeStringBuffer(StringBuffer ss1,StringBuffer ss2)//���ݵ��ǵ�ַ
	{
		ss1.append("World");
		ss2=ss1;//��ss1�ĵ�ַ����ss2,����ʵ����˵û��ʲôӰ��
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

