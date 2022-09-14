package exercicio_POO;

public class animais_POO_heranca_subclasse extends animais_POO_heranca {

	public String acao;
	
	public animais_POO_heranca_subclasse(String animal,String nome, int idade, String som,String acao) {
		super(animal,nome,idade,som);
		this.acao=acao;
}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	public void imprimirDados() {
		System.out.println("\nAnimal: "+getAnimal()+"\nNome: "+getNome()+"\nIdade: "+getIdade()+" anos.\nEle "+getSom()+"\nEle "+getAcao()+" para se proteger!");
	}
}