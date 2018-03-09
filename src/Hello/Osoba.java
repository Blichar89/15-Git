package Hello;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
	// To sa zmienne pamiętane w obiektach, na które można mówić:
	// pola (fields)
	// atrybuty (attribute)
	// zmienne instancyjne (instance variable)
	private String imie, nazwisko;
	private LocalDate dataUrodzenia;
	
	//Konstruktory, czyli specjalne metody uruchamiane podczas tworzenia obiektów
	public Osoba(){
		
	}
	
	Osoba(String name, String lastName){
		imie = name;
		nazwisko = lastName;
		
	}
	
	public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}
	
	public Osoba(String imie, String nazwisko, String dataUrodzenia) {
		// W ten sposób z jednego konstruktora mozemy wywolac inny konstruktor tej klasy
		this(imie, nazwisko, LocalDate.parse(dataUrodzenia));
	}
	
	public int getWiek() {  
		if(dataUrodzenia == null) {
			//jesli data urodzenia jest nieznana to jako wiek zwracamy -1.
			return -1;
		}
		LocalDate dzisiaj = LocalDate.now();
		// liczba lat, miesiecy i dni pomiedzy jedna a druga data
		Period wiekDokładnie = Period.between(dataUrodzenia, dzisiaj);
		return wiekDokładnie.getYears();
	}
	
	//Metody, czyli czynności, które potrafi wykonywać obiekt
	public void przedstawSie() {
		
		System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + getWiek() + " lat.");
		
	}
	
	public String kimJestes() {
		return "Jestem Osobą";
	}
	
	@Override
	public String toString(){
		
		return this.imie + " " + this.nazwisko + " " + getWiek() + " lat.";
		
	}
	
	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public LocalDate getDataUrodzenia() {
		return dataUrodzenia;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public void setDataUrodzenia(LocalDate dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	public void setDataUrodzenia(String data) {
		this.dataUrodzenia = LocalDate.parse(data);
	}
	
}
