package practice;
import java.util.*;
public class Buffer3 
{
	public static String reverseMethod(String sb,String str,int i)
	{
		if(i==0)
			return str;
		String ss=str.concat(String.valueOf(sb.charAt(i)));
		return reverseMethod(sb,ss,--i);
		
	}
	public static void main(String[] args)
	{
		//reverse the string using Buffer class without using rev fun
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String  :");
		String  str=sc.nextLine();
		System.out.println(Buffer3.reverseMethod(str,"",str.length()-1));
	}

}
