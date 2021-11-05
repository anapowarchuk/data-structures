package Lista3_ListaArranjo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//instanciando a classe Lista Arranjo
public class ArrayList1 {

	public static void main(String[] args) {
		List<Integer> n = new ArrayList <> ();

		// Adicionando n�s no Arranjo Din�mico
		n.add(10); // Adiciona um valor <> na Lista

		n.add(0, 10); // Adiciona um valor <> na posicao 0

		// Alterando n�s no nosso Arranjo Din�mico:
		n.set(0, 11); // Altera o valor <> na posi��o 0

		// Removendo n�s no nosso Arranjo Din�mico:
		n.remove(0); // Remove o valor <> na posi��o 0

		n.clear(); // Limpa a Lista

		// Buscando n�s no nosso Arranjo Din�mico:
		n.get(0); // Retorna o valor <> na posi��o 0

		n.indexOf(10); // Busca o valor <> na lista

		// Listar os n�s no nosso Arranjo Din�mico:
		// Imprime a lista de valores <>
		for (int i = 0; i < n.size(); i++) {
			System.out.println(n.get(i));
		}
		System.out.println(n);
		
		//Verifica se o Arranjo din�mico est� vazio:
		n.isEmpty(); // Verifica se n�o tem n�s em n
		//n.is; // Como verificar se est� cheio? --> fazendo if else
		
		// Ordena os valores<> na lista n
		Collections.sort(n);
		
	
	}

}
