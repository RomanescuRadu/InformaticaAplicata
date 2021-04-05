
public class Modificare implements Command{
	private StudentOptions stdopt;
	
	public Modificare(StudentOptions stdopt) {
		this.stdopt=stdopt;
	}
	
	@Override
	public void execute() {
		stdopt.Modificare();
	}

}
