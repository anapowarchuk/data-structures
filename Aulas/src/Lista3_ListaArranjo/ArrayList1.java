package Lista3_ListaArranjo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//instanciando a classe Lista Arranjo
public class ArrayList1 {

	public static void main(String[] args) {
		List<Integer> n = new ArrayList <> ();

		// Adicionando nós no Arranjo Dinâmico
		n.add(10); // Adiciona um valor <> na Lista

		n.add(0, 10); // Adiciona um valor <> na posicao 0

		// Alterando nós no nosso Arranjo Dinâmico:
		n.set(0, 11); // Altera o valor <> na posição 0

		// Removendo nós no nosso Arranjo Dinâmico:
		n.remove(0); // Remove o valor <> na posição 0

		n.clear(); // Limpa a Lista

		// Buscando nós no nosso Arranjo Dinâmico:
		n.get(0); // Retorna o valor <> na posição 0

		n.indexOf(10); // Busca o valor <> na lista

		// Listar os nós no nosso Arranjo Dinâmico:
		// Imprime a lista de valores <>
		for (int i = 0; i < n.size(); i++) {
			System.out.println(n.get(i));
		}
		System.out.println(n);
		
		//Verifica se o Arranjo dinâmico está vazio:
		n.isEmpty(); // Verifica se não tem nós em n
		//n.is; // Como verificar se está cheio? --> fazendo if else
		
		// Ordena os valores<> na lista n
		Collections.sort(n);
		
	
	}

}
