package PolimorfismoEx003;

public class Veterinario {

	public String examina(Animal animal) {
		return ("O " + animal.getNome() + " " + animal.emiteSom());
	}
}
