package javaclass;
class sample
{
	public int monthlysal()
	{
		return 50000;
	}
	public void annualsal(int monthlysal)
	{
		System.out.println("annualsal "+monthlysal*12);
	}
}

public class ReturnvalueInsideOther {

	public static void main(String[] args) {
		sample sam=new sample();
		int sal=sam.monthlysal();
		sam.annualsal(sal);

	}

}
