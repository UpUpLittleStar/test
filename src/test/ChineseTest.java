package test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ���������ַ����
 * @author eple
 *
 */
public class ChineseTest {
	public static void judgeChinese(String str)
	{
		String regx="[\u4e00-\u9fa5]";
		if(str.getBytes().length==str.length()){
			System.out.println("�޺���");
		}
		else
		{
			Pattern p=Pattern.compile(regx);
			Matcher m=p.matcher(str);
			while(m.find()){
				System.out.print(m.group(0)+"");
			}
		}
	}
	public static void main(String args[]){
		judgeChinese("Hello World");
		judgeChinese("Hello��ζ�����");
	}
	
}
