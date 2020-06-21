
public class Preparation implements State {

	@Override
	public void action(Context context) {
		// TODO Auto-generated method stub
		
		System.out.println("The order is beeing prepared.");
		context.setState(this);
	}
	
	public String toString()
	{
     return "Preparation state";
		 
	}
	

	
}
