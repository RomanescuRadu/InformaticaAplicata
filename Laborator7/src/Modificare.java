
public class Modificare implements Command{
	private MenuOptions student;
	
	public Modificare(MenuOptions student) {
		this.student=student;
	}
	
	@Override
	public void execute() {
		student.Modificare();
	}

}
