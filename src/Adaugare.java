
public class Adaugare implements Command {
	private StudentOptions stdopt;
	
	public Adaugare(StudentOptions stdopt) {
		this.stdopt=stdopt;
	}
	
	@Override
	public void execute() {
		stdopt.Adaugare();
	}

}
