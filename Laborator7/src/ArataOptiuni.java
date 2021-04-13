
public class ArataOptiuni implements Command {
private MenuOptions student;
	
	public ArataOptiuni(MenuOptions student) {
		this.student=student;
	}
	
	@Override
	public void execute() {
		student.ArataOptiuni();
	}
}
