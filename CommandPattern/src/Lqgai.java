
public class Lqgai implements Command {


	private Trainee trainee;
	
	public Lqgai(Trainee trainee) {
		this.trainee = trainee;
	}
	@Override
	public void execute() {
		trainee.setTraining("Legni");
	}
}
