package practice;
import java.util.Scanner;
import java.lang.*;
public class Strings2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str="Danduboina";
		//count and print the no of vowels in the program
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'A':
				System.out.println(ch);
				count++;
				continue;
			case 'e':
			case 'E':
				System.out.println(ch);
				count++;
				continue;
			case 'i':
			case 'I':
				System.out.println(ch);
				count++;
				continue;
			case 'o':
			case 'O':
				System.out.println(ch);
				count++;
				continue;
			case 'u':
			case 'U':
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("No of vowels present in the "+str.toString()+"  is  "+count);
	}

}
