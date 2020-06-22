package polimorfismo1;

public class Teste {
	public static void main(String[] args) {
		// instanciando com upcasting...
		Animal m1 = new Mamifero("Humano",2,80,"Terrestre",true);
		Animal m2 = new Mamifero("Cachorro",1,40,"Terrestre",false);
		
		// usando o downcasting...
		Mamifero m3 = (Mamifero) m1;
		Mamifero m4 = (Mamifero) m2;
		m3.showMammal();
		m4.showMammal();
		
		Ave a1 = new Ave("Arara", 1.20, 12,"Florestas Tropicais", true);
		Ave a2 = new Ave("Águia-Careca", 2.00, 23,"Florestas Temperadas", true);
		Ave a3 = new Ave("Avestruz", 3.00, 50,"Planícies", false);
		
		// vetor com upcasting....
		Animal vetorAves[] = new Ave[3];
		vetorAves[0] = a1;
		vetorAves[1] = a2;
		vetorAves[2] = a3;
		
		for(Animal vA: vetorAves) {
			// laço for each e fazendo o downcasting....
			if(vA instanceof Ave) {
				Ave aV1 = (Ave) vA;
				aV1.showBird();
			}
		}
		
		
	}
}
