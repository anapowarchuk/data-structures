package ListaArranjo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos alunos há na turma?");
		n = leitura.nextInt();
		
		ListaArranjo lista = new ListaArranjo(n);
		
		System.out.println("A turma está vazia?");
		System.out.println(lista.estaVazia());
		System.out.println("\n \n");
		
		System.out.println("A turma está cheia?");
		System.out.println(lista.estaCheia());
		System.out.println("\n \n");
		
		//Adicionando na proxima posição 
		for (int i=0; i<n; i++) {
		System.out.println("Quem você deseja adicionar na próxima posição disponível?");
		String nome;
		nome = leitura.next();
		lista.adicionar(nome); 
		}
		System.out.println("A turma está vazia?");
		lista.estaVazia();
		System.out.println("A turma está cheia?");
		lista.estaCheia();
		System.out.println("Lista de Alunos:");
		lista.imprimir();
		System.out.println("\n \n");
		
		//Buscando 
		System.out.println("Quem você deseja buscar?");
		String busca;
		busca=leitura.next();
		System.out.println("A posição que está o aluno é na " + lista.buscar(busca));
		System.out.println("\n \n");
		
		//Alterando
		System.out.println("Qual o nome que você deseja alterar?");
		String nome;
		nome= leitura.next();
		System.out.println("Qual o novo nome?");
		String novoNome;
		novoNome=leitura.next();
		lista.alterar(nome, novoNome);
		System.out.println("Lista de alunos alterada:");
		lista.imprimir();
		
		//Removendo
		System.out.println("Qual nome você deseja remover?");
		String nomeRemovido;
		nomeRemovido=leitura.next();
		lista.remover(nomeRemovido);
		System.out.println("Lista de alunos com " + nomeRemovido + " removido:");
		lista.imprimir();
		System.out.println("\n \n");
		
		//Adicionando em Determinada posição
		System.out.println("Qual a posição que você deseja adicionar o novo aluno?");
		int posicao;
		posicao=leitura.nextInt();
		System.out.println("Quem você deseja adicionar nessa nova posição?");
		String novoAluno;
		novoAluno= leitura.next();
		lista.adicionarPosicao(novoAluno, posicao);
		System.out.println("Lista de alunos com " + novoAluno + " adicionado na posição " + posicao);
		lista.imprimir();
		System.out.println("\n \n");
		
				
		leitura.close();
		
	}

}
