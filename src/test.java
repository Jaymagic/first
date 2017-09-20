


/**
 * <p>title test
 * @author Yuan.J
 * @DATE 2017-9-2下午03:24:57


 */
import java.util.*;
public class test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个四位整数作为年份：");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		Leap ye=new Leap();
		if(ye.leapyear(year))
		{ System.out.println("年份"+year+"年是闰年！");}
		else
		{ System.out.println("年份"+year+"年不是闰年！");}
		
	}	

}

class Leap{
	public boolean leapyear(int year){
		if(year%100==0){
			if(year%400==0){return true;}
		} else {
			if(year%4==0){return true;}
		}
		return false;

		}
}
