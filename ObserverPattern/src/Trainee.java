import java.util.ArrayList;

public class Trainee implements Observable {

	private ArrayList<Observer> observers;
	private String training;
	
	public Trainee()
	{
		observers = new ArrayList<>();
	}
	
	
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Viewer "+ (observerIndex+1) + " deleted");
		
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers)
		{
			observer.changeState(training);
		}
		
		
	}
	
	public void setTraining(String newTraining)
	{
		this.training= newTraining;
		notifyObserver();
	}

	
}
