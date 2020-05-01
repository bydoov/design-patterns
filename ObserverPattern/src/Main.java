
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainee trainee = new Trainee();
		Instructor instructor = new Instructor(trainee);
		Viewer viewer1 = new Viewer(trainee);
		Viewer viewer2 = new Viewer(trainee);
		Viewer viewer3 = new Viewer(trainee);
		
		instructor.ChangeTraining("Stani");
		instructor.ChangeTraining("Legni");
		
		
		
	}

}
