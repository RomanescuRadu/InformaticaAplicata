
public class Adaugare implements Command {
	private MenuOptions student;
	
	public Adaugare(MenuOptions student) {
		this.student=student;
	}
	
	@Override
	public void execute() {
		student.Adaugare();
	}

}
