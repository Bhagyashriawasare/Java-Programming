package String;

public class arraytostring {

	public static void main(String[] args) {
		String str[]= {"hello","i","am","a","girl"};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length;i++)
		{
			sb.append(" "+str[i]);
		}
		String s = sb.toString();//convert stringbuffer into string
		System.out.println(s);

	}

}
