package Hashing;

public class ListaEncadeada {

	private No primeiro;

	public ListaEncadeada() {
		this.primeiro = null;
	}

	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

	public void adicionarFinal(Stop letra) {
		if (estaVazia()) {
			this.primeiro = new No(letra);
		} else {
			No novo = new No(letra);
			No aux = this.primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}

	public int buscarNome(String nome) {
		int cont = 0;
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getNome() == nome) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public No buscarNomeNo(String Nome) {
		for (No aux = this.primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getNome() == Nome) {
				return aux;
			}
		}
		return null;
	}

	public int buscarCor(String cor) {
		int cont = 0;
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getCor() == cor) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public int buscarFruta(String fruta) {
		int cont = 0;
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getFruta() == fruta) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public No buscarFrutaNo(String Fruta) {
		for (No aux = this.primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getFruta() == Fruta) {
				return aux;
			}
		}
		return null;
	}
	
	public int buscarObjeto(String objeto) {
		int cont = 0;
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getObjeto() == objeto) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public No buscarObjetoeNo(String Objeto) {
		for (No aux = this.primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getObjeto() == Objeto) {
				return aux;
			}
		}
		return null;
	}
	
	public int buscarPais(String pais) {
		int cont = 0;
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getPais() == pais) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public No buscarPaisNo(String Pais) {
		for (No aux = this.primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getPais() == Pais) {
				return aux;
			}
		}
		return null;
	}
	
	public int buscarProfissao(String profissao) {
		int cont = 0;
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getProfissoes() == profissao) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public No buscarProfissaoNo(String Profissao) {
		for (No aux = this.primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getProfissoes() == Profissao) {
				return aux;
			}
		}
		return null;
	}
	
	public int buscarAnimal(String animal) {
		int cont = 0;
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getAnimal() == animal) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	public No buscarAnimalNo(String Animal) {
		for (No aux = this.primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getLetra().getAnimal() == Animal) {
				return aux;
			}
		}
		return null;
	}
	
	public void removerNome(Stop nome) {
		No aux = primeiro;
		if (this.primeiro.getLetra() == nome) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getLetra() == nome)
					aux.setProximo(aux.getProximo().getProximo());
				else
					aux = aux.getProximo();
			} while (aux.getProximo() != null);
		}
	}

		No aux = primeiro;
		if (this.primeiro.getLetra() == cor) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getLetra() == cor)
					aux.setProximo(aux.getProximo().getProximo());
				else
					aux = aux.getProximo();
			} while (aux.getProximo() != null);
		}
	}

	public void removerFruta(String fruta) {
		No aux = buscarFrutaNo(fruta);
		if (this.primeiro.getLetra() == fruta) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getLetra() == fruta)
					aux.setProximo(aux.getProximo().getProximo());
				else
					aux = aux.getProximo();
			} while (aux.getProximo() != null);
		}
	}

	public void removerObjeto(Stop objeto) {
		No aux = buscarObjetoNo(objeto);
		if (this.primeiro.getLetra() == objeto) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getLetra() == objeto)
					aux.setProximo(aux.getProximo().getProximo());
				else
					aux = aux.getProximo();
			} while (aux.getProximo() != null);
		}
	}

	public void removerPais(String pais) {
		No aux = buscarPaisNo(pais);
		if (this.primeiro.getLetra() == pais) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getLetra() == pais)
					aux.setProximo(aux.getProximo().getProximo());
				else
					aux = aux.getProximo();
			} while (aux.getProximo() != null);
		}
	}

	public void removerProfissoes(String profissoes) {
		No aux = buscarProfissaoNo(profissoes);
		if (this.primeiro.getLetra() == profissoes) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getLetra() == profissoes)
					aux.setProximo(aux.getProximo().getProximo());
				else
					aux = aux.getProximo();
			} while (aux.getProximo() != null);
		}
	}

	public void removerAnimal(String animal) {
		No aux = buscarAnimalNo(animal);
		if (this.primeiro.getLetra() == animal) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getLetra() == animal)
					aux.setProximo(aux.getProximo().getProximo());
				else
					aux = aux.getProximo();
			} while (aux.getProximo() != null);
		}
	}

}
