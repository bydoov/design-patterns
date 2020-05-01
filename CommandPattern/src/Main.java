
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Instructor instructor = new Instructor();
Trainee trainee = new Trainee();

Viewer v1 = new Viewer(trainee);
Viewer v2 = new Viewer(trainee);
Viewer v3 = new Viewer(trainee);



Command changeTrainingToLegni = new Lqgai(trainee);
Command changeTrainingToStani = new Stavai(trainee); 

instructor.setCommand(changeTrainingToLegni);
instructor.ChangeTraining();

instructor.setCommand(changeTrainingToStani);
instructor.ChangeTraining();


	}

}
