package practice;
import java.util.*;
public class Arrays1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int left[]=Arrays.copyOfRange(arr,0,0);
		int right[]=Arrays.copyOfRange(arr,1,arr.length);
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
	}

}
