
public class Afisare implements Command{
	private MenuOptions student;
	
	public Afisare(MenuOptions student) {
		this.student=student;
	}
	
	@Override
	public void execute() {
		student.Afisare();
	}

}
