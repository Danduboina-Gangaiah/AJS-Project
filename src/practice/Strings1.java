package practice;
import java.util.Scanner;
import static java.lang.String.*;
class IsVowel
{
	public boolean isVowel(char ch)
	{
		if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||
				(ch=='o'||ch=='O')||(ch=='u'||ch=='U'))
		{
			System.out.println(ch);
			return true;
		}
		return false;
	}
}
class Count
{
	public static int count(String str)
	{
		IsVowel vo=new IsVowel();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(vo.isVowel(str.charAt(i)))
			{
				count++;
//				System.out.println(str.charAt(i));
			}
		}
		return count;
	}
}
class Print
{
	public void printingMachine(String st)
	{
		System.out.println("No of Vowels in the String is "+new Count().count(st));
	}
}
public class Strings1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str="Danduboina";
		//program to find the no of vowels in the name
		Print pr=new Print();
		pr.printingMachine(str);
		if(false);
		{
			System.out.println("Dada");
		}
		
	}

}
