package Interface1;
import java.util.*;
public class InterfaceClass implements Interface1
{
	public int tableArea(int length,int breadth)
	{
		return length*breadth;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		InterfaceClass ic=new InterfaceClass();
		System.out.println(ic.tableArea(20, 30));
	}
}
