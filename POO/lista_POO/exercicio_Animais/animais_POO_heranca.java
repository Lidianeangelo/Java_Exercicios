/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

package exercicio_POO;

public class animais_POO_heranca {

	public String animal;
	public String nome;
	public int idade;
	public String som;
	
	
	public animais_POO_heranca(String animal, String nome, int idade, String som) {
		this.animal=animal;
		this.nome=nome;
		this.idade=idade;
		this.som=som;
		
}

	public String getAnimal() {
		return animal;
	}


	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}
	
	
	
}