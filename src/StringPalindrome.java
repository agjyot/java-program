import java.util.Scanner;

public class StringPalindrome {
	static boolean isPalindrome(String str){
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) 
				return false;
				i++;
				j--;
		}
			return true;
			
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		boolean rs=isPalindrome(str);
		if(rs)
		System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");	
	}

}
