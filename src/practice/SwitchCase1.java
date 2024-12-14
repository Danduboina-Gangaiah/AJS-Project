package practice;
import java.util.*;
public class SwitchCase1
{
	public static boolean checkBranch(String str)
	{
		return switch(str)
		{
		case "CSE":
			yield true;
		case "EEE":
			yield true;
		case "ECE":
		default:
			yield false;
		};
		
	}
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Branch  : ");
	  String str=sc.nextLine().toUpperCase();
	  System.out.println("You Entered "+str+"\tBranch !");
	  if(checkBranch(str))
	  {
		  System.out.println("Let's Begin Journey towards Sathaybama !");
	  }
	  else
		  System.out.println("Sorry Your selected Branch is not available Here");
	}

}
