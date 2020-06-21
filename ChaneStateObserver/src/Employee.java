
public abstract class Employee implements Observable  {

	public Employee nextChain;
	public static int CityShipmentNumber =1;
	public static int NationalShipmentNumber =2;
	public static int AbroadShipmentNumber =3;
	
	protected int level;
	
	
	abstract void printMessage(String msg);
	
	
	
	public void setNextChain(Employee newNextChain)
	{
		nextChain=newNextChain;
	}
	
	public void takeOrder(int newLevel, String msg)
	{
		if(level==newLevel)
		{
			this.printMessage(msg);
		}
		else if(nextChain!=null)
		{
			nextChain.takeOrder(newLevel, msg);
		}
		
	}
	
	
	
	
}
