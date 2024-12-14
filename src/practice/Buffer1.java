package practice;
import java.util.*;
import java.lang.StringBuffer;
public class Buffer1 
{
	public static void main(String...Gangaiah)
	{

	Scanner sc=new Scanner(System.in);
	StringBuffer sb=new StringBuffer();
	sb.append(sc.nextLine());
	System.out.println(sb.toString());
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	sb.append(sc.nextLine());
	System.out.println(sc.nextLine());
	System.out.println(sb.length());
	System.out.println(sb.capacity());
}
}
