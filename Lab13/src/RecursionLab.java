import java.util.Scanner;

public class RecursionLab 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a palindrome to test: ");
		Scanner console = new Scanner(System.in);
		String inStr = console.nextLine();
		if (isaPalindrome(inStr)) 
		{
			System.out.printf("The input string, %s, is a palindrome.\n", inStr);
			reverseStr(inStr); // must be recursive!
			System.out.println();
		} 
		else 
		{
			System.out.printf("The input string, %s, is not a palindrome.\n", inStr);
		}
	}
	public static void reverseStr(String str)
	{
		int strL=str.length();
		if(strL>0)
		{
			System.out.print(str.charAt(str.length()-1));
			reverseStr(str.substring(0,strL-1));
		}
		else
		{
			System.out.print("");
		}
	}
	public static String aString(String str)
	{
		int A=(int)'A';
		int a=(int)'a';
		String newStr="";
		for(int i=0; i<str.length(); i++)
		{
			char c=str.charAt(i);
			int cast=(int)c;
			if(cast>=A && cast<=A+25)
			{
				newStr+=(char)(c+32);
			}
			else if((cast>=a && cast<=a+25) || (cast>=48 && cast<=57))
			{
				newStr+=str.charAt(i);
			}
			else
			{
				newStr+="";
			}
		}
		return newStr;
	}
	public static boolean isaPalindrome(String str)
	{
		String newStr=aString(str);
		System.out.println(newStr);
		int newStrL=newStr.length();
		for(int i=0; i<newStrL;i++)
		{
			if(newStr.charAt(i)!=newStr.charAt(newStrL-i-1))
				return false;
		}
		return true;
	}
}
