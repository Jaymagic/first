


/**
 * <p>title test
 * @author Yuan.J
 * @DATE 2017-9-2����03:24:57


 */
import java.util.*;
public class test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����λ������Ϊ��ݣ�");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		Leap ye=new Leap();
		if(ye.leapyear(year))
		{ System.out.println("���"+year+"�������꣡");}
		else
		{ System.out.println("���"+year+"�겻�����꣡");}
		
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
