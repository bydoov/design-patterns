
public class Instructor {

	private Command command;	

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void ChangeTraining() {
		this.command.execute();
	}
}
