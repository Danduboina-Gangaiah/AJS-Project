package practice;
import java.util.*;
public class Tokenizer2 
{
	public static void main(String[] args)
	{
		//le's practice the stringTokenizer which took two parameters
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String   :");
		String str=sc.nextLine();
		System.out.println("Enter the delimeter:");
		String del=sc.nextLine();
		StringTokenizer s=new StringTokenizer(str,del);
		System.out.println("Total No of Tokens from the String According to Delimeter  :"+s.countTokens());
		StringBuffer ss=new StringBuffer();
		while(s.hasMoreTokens())
		{
			StringBuffer sb=new StringBuffer(s.nextToken());
			ss.append(sb.reverse()+" ");
		}
		System.out.println(ss.toString());
	}

}
