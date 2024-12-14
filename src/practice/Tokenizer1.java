package practice;
import java.util.StringTokenizer;
public class Tokenizer1 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s,"a");
	}

}
