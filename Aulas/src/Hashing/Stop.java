package Hashing;

public class Stop {
	
	private String nome;
	private String cor;
	private String fruta;
	private String objeto;
	private String pais;
	private String profissoes;
	private String animal;
	
	public Stop(String nome, String cor, String fruta, String objeto, String pais, String profissoes, String animal) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.fruta = fruta;
		this.objeto = objeto;
		this.pais = pais;
		this.profissoes = profissoes;
		this.animal = animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFruta() {
		return fruta;
	}

	public void setFruta(String fruta) {
		this.fruta = fruta;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getProfissoes() {
		return profissoes;
	}

	public void setProfissoes(String profissoes) {
		this.profissoes = profissoes;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	
}