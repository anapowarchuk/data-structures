package ListaArranjo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos alunos h� na turma?");
		n = leitura.nextInt();
		
		ListaArranjo lista = new ListaArranjo(n);
		
		System.out.println("A turma est� vazia?");
		System.out.println(lista.estaVazia());
		System.out.println("\n \n");
		
		System.out.println("A turma est� cheia?");
		System.out.println(lista.estaCheia());
		System.out.println("\n \n");
		
		//Adicionando na proxima posi��o 
		for (int i=0; i<n; i++) {
		System.out.println("Quem voc� deseja adicionar na pr�xima posi��o dispon�vel?");
		String nome;
		nome = leitura.next();
		lista.adicionar(nome); 
		}
		System.out.println("A turma est� vazia?");
		lista.estaVazia();
		System.out.println("A turma est� cheia?");
		lista.estaCheia();
		System.out.println("Lista de Alunos:");
		lista.imprimir();
		System.out.println("\n \n");
		
		//Buscando 
		System.out.println("Quem voc� deseja buscar?");
		String busca;
		busca=leitura.next();
		System.out.println("A posi��o que est� o aluno � na " + lista.buscar(busca));
		System.out.println("\n \n");
		
		//Alterando
		System.out.println("Qual o nome que voc� deseja alterar?");
		String nome;
		nome= leitura.next();
		System.out.println("Qual o novo nome?");
		String novoNome;
		novoNome=leitura.next();
		lista.alterar(nome, novoNome);
		System.out.println("Lista de alunos alterada:");
		lista.imprimir();
		
		//Removendo
		System.out.println("Qual nome voc� deseja remover?");
		String nomeRemovido;
		nomeRemovido=leitura.next();
		lista.remover(nomeRemovido);
		System.out.println("Lista de alunos com " + nomeRemovido + " removido:");
		lista.imprimir();
		System.out.println("\n \n");
		
		//Adicionando em Determinada posi��o
		System.out.println("Qual a posi��o que voc� deseja adicionar o novo aluno?");
		int posicao;
		posicao=leitura.nextInt();
		System.out.println("Quem voc� deseja adicionar nessa nova posi��o?");
		String novoAluno;
		novoAluno= leitura.next();
		lista.adicionarPosicao(novoAluno, posicao);
		System.out.println("Lista de alunos com " + novoAluno + " adicionado na posi��o " + posicao);
		lista.imprimir();
		System.out.println("\n \n");
		
				
		leitura.close();
		
	}

}
