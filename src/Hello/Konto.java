package Hello;

/* To jest klasa Konto*/
public class Konto {

	private final int numer;
	private int saldo;
	private Osoba właściciel;
	
	public Konto(int numer, int saldo, Osoba właściciel) {
		this.numer = numer;
		this.saldo = saldo;
		this.właściciel = właściciel;
	}

	@Override
	public String toString() {
		return "Konto nr= " + numer + ", saldo= " + saldo + ", właściciel= " + właściciel;
	}
	
//	int wpłata(int x) {
//		saldo += x;
//		return saldo;
//		
//	}
	
	public void wplata( int x) {
		saldo += x;
					
	}

	public int getNumer() {
		return numer;
	}

	public int getSaldo() {
		return saldo;
	}

	public Osoba getWłaściciel() {
		return właściciel;
	}

	public void setWłaściciel(Osoba właściciel) {
		this.właściciel = właściciel;
	}
	
	
	
}
