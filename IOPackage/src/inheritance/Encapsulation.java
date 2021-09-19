package inheritance;
class hiding
{
	private int accno;
	String name;
	public int  setaccnumber(int accno)
	{
		this.accno=accno;
		return accno;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 hiding hd=new  hiding();
		int output= hd.setaccnumber(1234);
		System.out.println(output);
		 
	}

}
