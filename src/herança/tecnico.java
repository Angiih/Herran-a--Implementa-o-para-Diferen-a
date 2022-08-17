package herança;

public class tecnico extends aluno {

 private String registroProfissional;
 
 
 public void praticar() {
	 System.out.println("O Aluno tecnico está praticando " + this.nome);

 }


public String getRegistroProfissional() {
	return registroProfissional;
}


public void setRegistroProfissional(String registroProfissional) {
	this.registroProfissional = registroProfissional;
}
 
 
 
}
