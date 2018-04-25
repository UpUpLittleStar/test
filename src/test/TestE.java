package test;

public class TestE {
 public static void main(String args[])
 {
	 double m=max(3.1,4.5,-3.7,-1);
	 System.out.print(m);
 }
 //参数数量可变算法
 public static double max(double... values)
 {
	 double large=Double.NEGATIVE_INFINITY;
	 for(double v:values)
	 {
		 if(v>large)
			 large=v;
	 }
	 return large;
 }
}
