package practice;
import java.util.*;
public class Buffer2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		sb.append(sc.nextLine());
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(sc.nextLine());
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.insert(10,sc.nextLine());
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		sb.delete(10,18);
		System.out.println(sb.toString());
	}

}
