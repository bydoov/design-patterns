
public class WorkerBoy implements Observer {

	private String workerName;
	private Observable emp;
	
	public WorkerBoy(String workerName)
	{
		this.workerName=workerName;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		if(emp==null)
		{
			System.out.println("There is no shipment to take to the warehose!");
			
		}
		else
			System.out.println(workerName+" is taking the shipment.");
			
	}

	@Override
	public void setEmployee(Observable emp) {
		// TODO Auto-generated method stub
		
		this.emp=emp;
	}

	
}
