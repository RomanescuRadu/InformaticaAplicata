
public class Student {
private String nume;
private int nota;

Student(String nume,int nota){
	this.nume=nume;
	this.nota=nota;
}

public void setNume(String nume) {
	this.nume=nume;
}

public void setNota(int nota) {
	this.nota=nota;
}
   
public String getNume() {
	return nume;
}

public int getNota() {
	return nota;
}

public String toString(){
    return("Numele studentului: "+this.getNume()+
    		"\nNota studentului:  "+this.getNota());
}

}
