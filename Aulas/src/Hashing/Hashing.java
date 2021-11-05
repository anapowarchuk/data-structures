package Hashing;

public class Hashing {
	
	private ListaEncadeada hashing[];
	
	
	public Hashing (int m) {
		this.hashing = new ListaEncadeada[m];
	}
	
	public int hash (String nome) {
	return (int) nome.charAt(0) % 27 - 1;
	}
	
	public void inserir (Stop letra, int posicao) {
		posicao = hash(letra.getNome());
		hashing[posicao].adicionarFinal(letra);
	}
	
	public int buscar (String atributo, String valor) {
		int posicao = hash(valor);
		int retorna = 0;
		if (atributo.equalsIgnoreCase("Nome")) {
			retorna=hashing[posicao].buscarNome(valor);
		}
		else if (atributo.equalsIgnoreCase("Cor")) {
			retorna=hashing[posicao].buscarCor(valor);
		}
		else if (atributo.equalsIgnoreCase("Fruta")) {
			retorna=hashing[posicao].buscarFruta(valor);
		}
		else if (atributo.equalsIgnoreCase("Objeto")) {
			retorna=hashing[posicao].buscarObjeto(valor);
		}
		else if (atributo.equalsIgnoreCase("País")) {
			retorna=hashing[posicao].buscarPais(valor);
		}
		else if (atributo.equalsIgnoreCase("Profissões")) {
			retorna=hashing[posicao].buscarProfissao(valor);
		}
		else if (atributo.equalsIgnoreCase("Animal")) {
			retorna=hashing[posicao].buscarAnimal(valor);
		}
		return retorna;
	}

		int posicao=hash(valor);
		if (atributo.equalsIgnoreCase("Nome")) {
			hashing[posicao].removerNome(valor);
		}
		else if (atributo.equalsIgnoreCase("Cor")) {
			hashing[posicao].removerCor(valor);
		}
		else if (atributo.equalsIgnoreCase("Fruta")) {
			hashing[posicao].removerFruta(valor);
		}
		else if (atributo.equalsIgnoreCase("Objeto")) {
			hashing[posicao].removerObjeto(valor);
		}
		else if (atributo.equalsIgnoreCase("País")) {
			hashing[posicao].removerPais(valor);
		}
		else if (atributo.equalsIgnoreCase("Profissões")) {
			hashing[posicao].removerProfissoes(valor);
		}
		else if (atributo.equalsIgnoreCase("Animal")) {
			hashing[posicao].removerAnimal(valor);
		}
	}
}