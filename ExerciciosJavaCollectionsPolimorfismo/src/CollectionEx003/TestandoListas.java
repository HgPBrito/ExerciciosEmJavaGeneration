package CollectionEx003;

import java.util.*;

public class TestandoListas {
	public static void main(String[] args) {
		
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		ArrayList<String> aulas = new ArrayList<>();// cria uma lista vazia de String
		aulas.add(aula1);// adiciona uma numero String a lista
		aulas.add(aula2);// adiciona uma numero String a lista
		aulas.add(aula3);// adiciona uma numero String a lista
		System.out.println(aulas);//imprime a lista de aulas
		System.out.println(aulas.size());//mostra o tamanho da lista de aulas
		// cuidado! <= faz sentido aqui?
		for (int i = 0; i <= aulas.size(); i++) {// no caso teria que ser < so por causa que o contador começa em 0 e a posição da lista também
			System.out.println("Aula: " + aulas.get(i));//imprime as aulas uma a uma e mais um erro null devido o <=
		}
	}
	
}