package practice;
import java.lang.*;
import java.text.*;
import java.util.Random;
public class Ascii {

	public static void main(String[] args)
	{
		/*
		 *TYPE CASTING
		 *1.Widening type casting
		 *2.Narrowing type casting
		 *WIDENING TYPE CASTING:converting lower data values into higher data values
		 *ex:byte-->short-->char-->int-->long-->float-->double
		 *NARROWING TYPE CASTING:converting upper data type vlaues into lower data values
		 *ex:double-->float-->long-->int-->char-->short-->byte
		 **/
		/*
		 * ASCII-->AMERICAN STANDARD CODE FOR INFORMATION AND INTERCHANGE
		   NUMBERS ---->  48-57;
		   LOWER CASE-->  97-122;
		   UPPER CASE-->  65-90;
		 * */
		for(int i=48;i<=57;i++)
		{
			System.out.println((char)i);
		}
		for(int i=65;i<=90;i++)
		{
			System.out.println((char)i);
		}
		for(int i=97;i<=122;i++)
		{
			System.out.println((char)i);
		}
		System.out.println((char)33);
		Random rn=new Random();
		int r=rn.nextInt(63783);
		System.out.println(r);
	}

}
