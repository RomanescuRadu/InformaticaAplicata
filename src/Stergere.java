
public class Stergere implements Command{
	private StudentOptions stdopt;
	
	public Stergere(StudentOptions stdopt) {
		this.stdopt=stdopt;
	}
	
	@Override
	public void execute() {
		stdopt.Stergere();
	}

}
