package Hello;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Pierwsza wersja.");
		System.out.println("Druga wersja.");
		System.out.println("Trzecia wersja.");
		
		Osoba ala = new Osoba("Ala", "Makota", "1989-03-12");
		System.out.println(ala);

		Konto konto = new Konto(11, 2000, ala);
		konto.wplata(500);
		System.out.println(konto);
		
		System.out.println("Obiad!!");
		
	}

}
