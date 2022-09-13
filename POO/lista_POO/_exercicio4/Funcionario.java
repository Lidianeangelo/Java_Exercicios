/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

package exercicio_POO;

public class Funcionario {

	//atributos//
	private String nomeFuncionario;
	private String idade;
	private String sexo;
	private String nacionalidade;
	private String setor;
	private String cargo;

	//construtor//
	public Funcionario(String nomeFuncionario, String idade, String sexo, String nacionalidade, String setor,
			String cargo) //parâmetro//
	
	{//atributos
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.idade = idade;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		this.setor = setor;
		this.cargo = cargo;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario=nomeFuncionario;
	}
	
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void imprimirInfo() {
		System.out.printf("Funcionário: "+nomeFuncionario+"\nÁrea: "+setor+"\nCargo: "+cargo);
		
	}
	
}
