package test;
import java.time.LocalDate;
import java.util.*;
public class Test123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person a=new Person();
    Person b=a;
    a.setAge(10);
     System.out.print(a.getAge()+","+b.getAge());
  
     
      
	}

}
class Person
{
	private int age;
	private String name;
	public void setAge(int age){
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}