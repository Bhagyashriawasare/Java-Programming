package String;

public class reverse {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());
		
		StringBuilder s1=new StringBuilder("india");
		System.out.println(s1.reverse());
		
		//using method
		String s2="bhagyashri";
		String output="";
		int l = s2.length();
		for(int i=l-1;i>=0;i--)
		{
			output=output+s2.charAt(i);
		}
		System.out.println(output);

	}

}
