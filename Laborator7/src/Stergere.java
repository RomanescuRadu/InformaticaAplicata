
public class Stergere implements Command{
	private MenuOptions student;
	
	public Stergere(MenuOptions student) {
		this.student=student;
	}
	
	@Override
	public void execute() {
		student.Stergere();
	}

}
