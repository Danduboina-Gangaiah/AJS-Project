package practice;
import java.util.*;
public class DoubleList
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<List<Integer>> dl=new ArrayList<>();
		List<Integer> fl=new ArrayList<>();
		System.out.println("Enter the no of Elements of in the first List : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			fl.add(sc.nextInt());
		}
		List<Integer> sl=new ArrayList<>();
		System.out.println("Enter the no of Elements of in the Seocnd List : ");
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			sl.add(sc.nextInt());
		}
		dl.add(fl);
		dl.add(sl);
		System.out.println("Total List is : "+dl);
	}

}
