import java.util.ArrayList;
import java.util.List;

public class Trainee {

	private String training;
	private ArrayList<Viewer> viewers;

	public Trainee()
	{
		viewers = new ArrayList<>();
	}
	
	public void setTraining(String training)
	{
		this.training = training;
		for(Viewer viewer: this.viewers) {
			viewer.setTraining(this.training);
		}		
	}
	public void register(Viewer viewer) {
		this.viewers.add(viewer);		
	}
}
