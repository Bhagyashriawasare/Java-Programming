package String;

public class PalindromeString {

	public static void main(String[] args) {
		String s1="MADAM";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println(s1+": Is Palindrome");
		}
		else {
			System.out.println(s1+": Is Not Palindrome");
		}
		

	}

}
