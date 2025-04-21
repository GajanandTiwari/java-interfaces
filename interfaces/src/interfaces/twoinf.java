package interfaces;
class inf implements twomthds,ritence
{
	public void show()
	{
	System.out.println("Executing show method");	
	}
	public void dontshow()
	{
		System.out.println("executing dont show method");
	}
	public void demo()
	{
		System.out.println("executing demo method");
	}
}
public class twoinf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inf obj=new inf();
		obj.show();
		obj.dontshow();
		obj.demo();

	}

}
