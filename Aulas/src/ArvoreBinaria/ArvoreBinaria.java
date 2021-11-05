package ArvoreBinaria;

public class ArvoreBinaria {
	private No raiz;

	// construtor que inicializa a �rvore
	public ArvoreBinaria() {
		this.raiz = null;
	}

	// retorna se a �rvore est� vazia
	public boolean estaVazia() {
		if (this.raiz == null) {
			return true;
		}
		return false;
	}

	// insere o valor da �rvore
	public void inserirNo(int valor) {
		No novo = new No(valor);
		if (estaVazia()) {
			novo = this.raiz;
		} else {
			No atual = this.raiz;
			boolean adc = false;
			while (adc == true) {
				No pai = atual;
				if (atual.getDado() < valor) {
					atual = atual.getDireita();
					if (atual == null) {
						pai.setDireita(novo);
						adc = true;
					}
				} else {
					atual = atual.getEsquerda();
					if (atual == null) {
						pai.setEsquerda(novo);
						adc = true;
					}
				}
			}
		}
	}

	// busca o valor na �rvore
	public No buscarNo(int valor) {
		No atual = this.raiz;
		while (atual != null) {
			if (atual.getDado() == valor) {
				return atual;
			} else if (atual.getDado() > valor) {
				atual = atual.getEsquerda();
			} else {
				atual = atual.getDireita();
			}
		}
		return null;

	}

	// remove o valor da �rvore
	public void removerNo(int valor) {
		buscarNo(valor);
		if (eFolha()) {
			if (!estaVazia()) {
				No atual = this.raiz;
				int cont = 0;
				while (cont<valor) {
					atual = atual.ge
				}
			}
		}

	}

	// retorna a quantidade de n�s que a �rvore possui
	public int qtdNos() {
		if (estaVazia()) {
			return 0;
		} else {
			int qtd = 0;
			for (No aux = this.raiz; aux != null; aux = aux.getDireita()) {
				qtd++;
			}
			for (No aux = this.raiz; aux != null; aux = aux.getEsquerda()) {
				qtd++;
			}
			return qtd - 1;// a raiz foi contada duas vezes
		}
	}

	// retorna a altura da �rvore
	public int altura() {
		if (this.raiz == null) {
			return 0;
		} else {
			if ((this.raiz.getEsquerda() == null) && (this.raiz.getDireita() == null)) {
				return 0;
			} else {
				int contE;
				for (No aux = this.raiz.getEsquerda(); aux != null; aux.getEsquerda() ) {
					contE ++;
				}
				int contD;
				for (No aux = this.raiz.getDireita(); aux != null; aux.getDireita() ) {
					contD ++;
				}
				if (contE >contD) {
					return 1+ this.raiz.getEsquerda();
				// return 1 + MAIOR altura(this.raiz.getEsquerda(), this.raiz.getDireita);
			}
		}
	}

	// retorna o n�vel de um determinado n� x
	public int nivel(No x) {

	}

	// retorna o grau de um determinado n� x
	public int grau(No x) {

	}

	// retorna se o determinado no x � folha
	public boolean eFolha(No x) {
		if (x.getDireita() == null && x.getDireita() == null) {
			return true;
		}
		return false;
	}

	// retorna quantos n�s da �rvore s�o folhas
	public int quantidadeFolhas() {
		int qtd = 0;
		if (eFolha(this.raiz)) {
			return 1;
		} else {
			for (No aux = this.raiz.getDireita(); aux != null; aux = aux.getDireita()) {
				if (eFolha(aux)) {
					qtd++;
				}
			}
			for (No aux = this.raiz.getEsquerda(); aux != null; aux = aux.getEsquerda()) {
				if (eFolha(aux)) {
					qtd++;
				}
			}
			return qtd;
		}
	}

	// retorna o n� com o maior valor dentre todos os n�s da �rvore
	public No maior() {
		No atual = this.raiz;
		No anterior = null;

		while (atual != null) {
			anterior = atual;
			atual = atual.getDireita();
		}
		return anterior;
	}

	// retorna o n� com o menor valor dentre todos os n�s da �rvore
	public No menor() {
		No atual = this.raiz;
		No anterior = null;

		while (atual != null) {
			anterior = atual;
			atual = atual.getEsquerda();
		}
		return anterior;
	}

	// visita os n�s da �rvore de forma pr�-fixada
	public void caminhamentoPrefixado(No x) {
		System.out.println(x.getDado() + " ");
		caminhamentoPrefixado(x.getEsquerda());
		caminhamentoPrefixado(x.getDireita());
	}

	// imprime pr� - fixado
	public void imprimirPre() {
		caminhamentoPrefixado(this.raiz);
	}

	// visita os n�s da �rvore de forma central
	public void caminhamentoCentral(No x) {
		caminhamentoCentral(x.getEsquerda());
		System.out.println(x.getDado());
		caminhamentoCentral(x.getDireita());
	}

	// imprime central
	public void imprimirCentral() {
		caminhamentoCentral(this.raiz);
	}

	// visita os n�s da �rvore de forma p�s-fixada
	public void caminhamentoPosfixado(No x) {
		caminhamentoPosfixado(x.getEsquerda());
		caminhamentoPosfixado(x.getDireita());
		System.out.println(x.getDado());
	}

	public void imprimirPos() {
		caminhamentoPosfixado(this.raiz);
	}

}