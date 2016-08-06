# PalindromeSum
import java.util.Scanner;

public class PalindromeSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1 : ");
		int first=sc.nextInt();
		System.out.println("Enter input2 : ");
		int last=sc.nextInt();
		int add=0;
		for(int k=first;k<=last;k++)
		{
			String s=String.valueOf(k);
			StringBuffer sb=new StringBuffer(s);
			String s1=sb.reverse().toString();
			if(s.equals(s1))
			{
				add+=Integer.parseInt(s1);

			}
		}
		System.out.println(add);

	}

}
