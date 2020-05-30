package CollectionEx001;

import java.util.*;

public class Principal {
	
	/*Ex001
	 * 
	 * Implemente uma classe chamada Telefone. A classe tem nrTelefone: 
	 * String e tipoTelefone: int {0=residencial,1=comercial,2=celular}. 
	 * Faça um programa que leia os números do telefone. Ao finalizar 
	 * salve os telefones (arraylist) em um arquivo. Ao executar o 
	 * programa faça a leitura do arquivo e carregue a lista de telefones 
	 * para a visualização.
	 */

	public static void main(String[] args) {		
		
		List<Telefone> lista = new ArrayList<Telefone>();		
		int qtdTelefones;
		
		do {
			qtdTelefones = (int) (Math.random()*16.0);
		} while(qtdTelefones == 0);
		
		for(int i = 0; i < qtdTelefones; i++) {			
			
			int tipo = (int) (Math.random()*3.0);			
			String numero = "";			
			
			if(tipo == 2) {				
				numero = "9";				
			}
			
			for(int j = 0; j < 8; j++) {//				
				int num = (int) (Math.random()*10.0);
				numero += num;	
				
			}		
			
			Telefone tel = new Telefone(tipo, numero);
			lista.add(tel);			
		}	

		
		Telefone telefone;
		Iterator<Telefone> itr = lista.iterator();
		while (itr.hasNext()) {
			telefone = itr.next();
			System.out.println("Numero de um " + telefone.getTipoTelefone() + ": " + telefone.getNrTelefone());
		}
	}
}
