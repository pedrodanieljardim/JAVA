
public class Principal {
	public static void main(String[] args) {
		Mamifero m2 = new Mamifero("Camelo","Amarelo","Deserto",4,150,2.0,"Palha");
		m2.mostraAnimal();
		Peixe p1 = new Peixe("Tubarão","Azul","Mar",0,300,1.5,"Barbatanas e Cauda");
		p1.mostraAnimal();
		Mamifero m1 = new Mamifero("Urso","Cinza","Floresta",4,180,0.5,"Mel");
		m1.mostraAnimal();
	}
}
