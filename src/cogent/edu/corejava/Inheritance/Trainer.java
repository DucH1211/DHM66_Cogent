package cogent.edu.corejava.Inheritance;

public class Trainer extends Employee {
	int trainerID;
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println(" and TrainerID: " + trainerID);
	}

}
