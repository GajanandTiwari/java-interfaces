package interfaces;
class yes implements twomthds

{
	public void show()
	{
		System.out.println("executing show method");
	}
	public void dontshow()
	{
		System.out.println("executing dontshow method");
	}
}
public class mthds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
yes obj=new yes();
obj.show();
obj.dontshow();
	}

}
