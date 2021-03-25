
public class Student {
private String nume;
private int nota;

Student(String nume,int nota){
	this.nume=nume;
	this.nota=nota;
}

public void setNume(String numeIntrodus) {
	nume=numeIntrodus;
}

public void setNota(int notaIntrodusa) {
	nota=notaIntrodusa;
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
