
public class Afisare implements Command{
	private StudentOptions stdopt;
	
	public Afisare(StudentOptions stdopt) {
		this.stdopt=stdopt;
	}
	
	@Override
	public void execute() {
		stdopt.Afisare();
	}

}
