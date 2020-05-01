
public class Stavai implements Command {

private Trainee trainee;
	
	public Stavai(Trainee trainee) {
		this.trainee = trainee;
	}
	@Override
	public void execute() {
		trainee.setTraining("Stani");
	}
}
