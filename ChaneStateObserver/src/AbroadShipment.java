import java.util.ArrayList;

public class AbroadShipment extends Employee {


	private ArrayList<Observer> clients = new ArrayList<Observer>();
	
	public AbroadShipment() 
	{
		this.level = Employee.AbroadShipmentNumber;
	}
	
	
	@Override
	void printMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Client wants to make abroad shipment." + msg);
		Context con = new Context();
		
		Preparation prep = new Preparation();
		prep.action(con);
		
		System.out.println(con.getState().toString());
		
		notifyObservers();
		
		System.out.println("Abroad employee is ready with the order.Next client please...");
		
		
	}


	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		clients.add(observer);
		observer.setEmployee(this);
		
		
	}


	@Override
	public void unregister(Observer observer) {
		// TODO Auto-generated method stub
		
		clients.remove(observer);
		
	}


	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer ob:clients)
		{
			ob.update();
		}
	}

}
