package ListaArranjo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Turma turmaA = new Turma(2);
		List<String> turmaB = new ArrayList<>();

		turmaA.adicionar("Aluno da turma A");
		turmaA.adicionar("Aluno da turma A1");
		turmaB.add("Aluno da turma B");
		turmaB.add("Aluno da turma B1");

		turmaA.alterar("Aluno da turma A", "Aluno A");
		turmaB.set(0, "Aluno B");

		turmaA.listar();
		System.out.println(turmaB);

		System.out.println(turmaA.buscar("Aluno A"));
		System.out.println(turmaB.indexOf("Aluno B"));

		System.out.println(turmaA.estaCheia());

		turmaA.remover("Aluno A");
		turmaB.remove("Aluno B");

		turmaA.limpar();
		turmaB.clear();

		System.out.println(turmaA.estaVazia());
		System.out.println(turmaB.isEmpty());
	}

}