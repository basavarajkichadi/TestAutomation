package stringdemo;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pallindrome("gadag");
	
	}
	static void pallindrome(String str)
	{
		String res="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			res+=str.charAt(i);
			
		}
		System.out.println(res);
		if(str.equals(res))
		{
			System.out.println("Given string is pallindrome");
		}
		else
		{
			System.out.println("not Pallindrome");
		}

	
	}
}
