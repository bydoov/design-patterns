
public class Viewer {

private String training;
	
private static int viewerIDTracker = 0;

private int viewerID;

public Viewer(Trainee trainee)
{
	
	this.viewerID = ++viewerIDTracker;
	System.out.println("New Viewer "+ this.viewerID);
	trainee.register(this);
}




	public void setTraining(String training)
	{
		this.training = training;
		System.out.println("Viewer " +viewerID+ " changed training to "+ this.training);

	}
}
