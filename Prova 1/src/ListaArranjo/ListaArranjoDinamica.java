package ListaArranjo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListaArranjoDinamica {
	public static void main(String[] args) {

		List<String> turma = new ArrayList<>();
		// adiciona
		turma.add("Ana");
		turma.add("Tati");
		turma.add("Vivi");
		// imprime
		for (int i = 0; i < turma.size(); i++) {
			System.out.println(turma.get(i));
		}
		System.out.println("\n");

		// altera
		turma.set(2, "Carla");
		// imprime
		for (int i = 0; i < turma.size(); i++) {
			System.out.println(turma.get(i));
		}
		System.out.println("\n");

		// esta vazia?
		turma.isEmpty();

		// ordena valores
		Collections.sort(turma);
		// imprime
		for (int i = 0; i < turma.size(); i++) {
			System.out.println(turma.get(i));
		}
		System.out.println("\n");

		// buscar
		System.out.println(turma.get(2));
		System.out.println(turma.indexOf("Ana"));

		// remove
		turma.remove(1);
		// imprime
		for (int i = 0; i < turma.size(); i++) {
			System.out.println(turma.get(i));
		}
		System.out.println("\n");

		// limpar
		turma.clear();
		// imprime
		for (int i = 0; i < turma.size(); i++) {
			System.out.println(turma.get(i));
		}
		System.out.println("\n");

	}
}
