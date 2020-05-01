
public class Viewer implements Observer {

	private String training;
	private static int viewerIDTracker = 0;
	
	private int viewerID;
	
	public Viewer(Observable trainee)
	{
		
		this.viewerID = ++viewerIDTracker;
		System.out.println("New Viewer "+ this.viewerID);
		trainee.register(this);
	}
	
	
	
	
	

	@Override
	public void changeState(String training) {
		// TODO Auto-generated method stub
this.training = training;
		
		printState();
	}




	private void printState() {
		// TODO Auto-generated method stub
		System.out.println("Viewer "+ viewerID + " changed training to :" + training);
		
	}

	
}
