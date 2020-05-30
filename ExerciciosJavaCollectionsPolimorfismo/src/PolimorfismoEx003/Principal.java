package PolimorfismoEx003;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Inu", 3);
		Cavalo cavalo = new Cavalo("Uma", 5);
		Preguica preguica = new Preguica("Flash", 12);
		Veterinario veterinario = new Veterinario();
		
		System.out.println(veterinario.examina(cachorro));
		System.out.println(veterinario.examina(cavalo));
		System.out.println(veterinario.examina(preguica));
	}
}
