package PolimorfismoEx002;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Inu", 3);
		Cavalo cavalo = new Cavalo("Uma", 5);
		Preguica preguica = new Preguica("Flash", 12);
		
		System.out.println("O cahorro " + cachorro.emiteSom());
		System.out.println("O cavalo " + cavalo.emiteSom());
		System.out.println("A preguiça " + preguica.emiteSom());
	}
}
