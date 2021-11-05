package Lista3_ListaArranjo;

import java.util.ArrayList;
import java.util.List;

import Lista3_ListaArranjo.ListaArranjo2;

import java.util.Collections;

public class Turma {

	public static void main(String[] args) {
		
		//lista est�tica de strings

		System.out.println("Lista Est�tica\n");
		
		ListaArranjo2 turmaE = new ListaArranjo2 (5) ;
		
		turmaE.adicionar ("Ana"); //adicionando alunos
		turmaE.adicionar("Carol"); //adicionando alunos
		turmaE.adicionar("Val"); //adicionando alunos
		turmaE.adicionar ("Vic"); //adicionando alunos
		turmaE.adicionar("Lari"); //adicionando alunos
		System.out.println("Lista da TurmaE:");
		turmaE.listar(); //listando a lista com os nomes dos alunos
		
		
		System.out.println("\nA turma est� cheia? " + turmaE.estaCheia()); //verificando se a lista est� cheia
		System.out.println("A turma est� vazia? " + turmaE.estaVazia()); //verificando se a lista est� vazia
		
		
		turmaE.alterar("Ana","Tatiana"); //alterando o nome dos Alunos 
		turmaE.alterar("Carol", "Rafa"); // alterando o nome dos Alunos
		System.out.println("\nLista da TurmaE alterada:");
		turmaE.listar(); //listando a nova lista com os nomes dos alunos
		
		
		turmaE.remover("Lari"); // removendo 
		System.out.println("\nLista da TurmaE com uma remo��o:");
		turmaE.listar(); //listando
	
		
		System.out.println("\nBuscar elemento " + turmaE.buscar("Val")); //buscando
		
		
		System.out.println("\n_______________________________________________");
		
		//lista din�mica de strings
		
		System.out.println("\nLista Din�mica\n");
		
		List<String> turmaD = new ArrayList <>();
				
		turmaD.add("Giovana"); //adicionando alunos
		turmaD.add("Claudia"); //adicionando alunos
		turmaD.add("Joana"); //adicionando alunos
		turmaD.add("Luisa"); //adicionando alunos
		turmaD.add("Vera"); //adicionando alunos
		System.out.println("Lista da TurmaD:");
		for (int i = 0; i < turmaD.size(); i++)  { //imprimindo a lista de alunos
			System.out.println(turmaD.get(i));
		}
		
				
		if (turmaD.isEmpty()== true) { //verificando se o arranjo din�mico est� vazio
			System.out.println("\nA lista est� vazia");
		}
		else {
			System.out.println("\nA lista est� cheia");  //verificando se o arranjo din�mico est� cheio
		}
		
		
		turmaD.set(2, "Julia"); //alterando o aluno da posi��o 2
		System.out.println("\nLista da TurmaD alterada:");
		for (int i = 0; i < turmaD.size(); i++)  { //imprimindo a lista de alunos
			System.out.println(turmaD.get(i));
		}
		
		
		turmaD.remove(2); //removendo o aluno da posi��o 5
		System.out.println("\nLista da TurmaD com uma remo��o:");
		for (int i = 0; i < turmaD.size(); i++)  { //imprimindo a lista de alunos
			System.out.println(turmaD.get(i));
		}
				
		
		System.out.println("\nBuscar elemento " + turmaD.indexOf("Luisa")); //buscando
		
		
		Collections.sort (turmaD);//ordenando os alunos na lista*/
		System.out.println("\nLista da TurmaD ordenada:");
		for (int i = 0; i < turmaD.size(); i++)  { //imprimindo a lista de alunos
			System.out.println(turmaD.get(i));
		}
		
		
		turmaD.clear(); //limpando a lista
		
				
	}

}
