package CollectionEx002;

import java.util.*;

public class MinhasCollections {
	
	/*Ex002
	 * 
	 * Faça a implementação do código abaixo e comente as 
	 * linhas das collections, explicando o que cada linha 
	 * faz na execução do mesmo.
	 */

	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer> ();// cria uma lista vazia de Arrays de numeros inteiros
		minhaLista.add(1);//adiciona um numero inteiro a lista
		minhaLista.add(2);//adiciona um numero inteiro a lista
		minhaLista.add(2);//adiciona um numero inteiro a lista

		for (Integer listaElementos : minhaLista) {// usado para percorrer a lista minhaLista
			System.out.println(listaElementos);// comando de saida, em um loop para listar cada elemento da lista
		}
		Set<Integer>  meuSet = new HashSet<Integer> ();// cria um conjunto vazio de Objetos de numeros inteiros
		meuSet.add(1);//adiciona um numero inteiro ao conjunto
		meuSet.add(2);//adiciona um numero inteiro ao conjunto
		meuSet.add(3);//adiciona um numero inteiro ao conjunto
		meuSet.add(1);//adiciona um numero inteiro ao conjunto
		Iterator<Integer>  iMeuSet = meuSet.iterator();// cria um "contador" por base do conjunto 
		
		while(iMeuSet.hasNext()){// usado para percorrer o conjunto meu Set criado
			System.out.println(iMeuSet.next());// comando de saida, em um loop para listar cada elemento do conjunto
		}
	}
}
