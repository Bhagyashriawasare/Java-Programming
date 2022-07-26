package String;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String s1="stream";
		String s2="master";
		if(s1.length()==(s2.length()))
		{
			char[] str1 = s1.toCharArray();
			char[] str2 = s2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			if(Arrays.equals(str1, str2))
			{
				System.out.println("string is anagram");
			}
			else
			{
				System.out.println("string is not anagram");
			}
		}
		else
		{
			System.out.println("fail");
		}
	}

}
