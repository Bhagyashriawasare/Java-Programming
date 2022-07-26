package String;

public class all_methods {

	public static void main(String[] args) {
		String s1="bhagyashri";
		String s2="AWASARE";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		
		String s3="       manish        ";
		System.out.println(s3.trim());
		System.out.println(s3.isEmpty());
		System.out.println(s1.charAt(9));
		System.out.println(s2.indexOf('A'));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s4="india";
		System.out.println(s4.replace('n','c'));
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(1, 3));
		System.out.println(s4.contains("bnh"));
		
		String s5="welcome-to-java-programming-world";
		String[] part = s5.split("-");
		for(int i=0;i<part.length;i++)
		{
			System.out.println("---->"+part[i]);
		}
		
		
	}

}
