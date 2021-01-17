package birthday;
import java.util.Scanner;

public class birth {


	public static void main(String[] args) {
		
		int result = recursion(2); //nagbago ka na
		System.out.println(""+result);
	}
	
	public static int recursion(int n){
		if(n==0)
		{
			return 0;
		}
		else
		{
			return n + recursion(n-1);
		}
	}

}