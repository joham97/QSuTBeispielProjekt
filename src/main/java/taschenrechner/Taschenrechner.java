package taschenrechner;

public class Taschenrechner {
	
	public int addieren(int zahl1, int zahl2) {
		return zahl1 + zahl2;
	}
	
	public int subtrahieren(int zahl1, int zahl2) {
		return zahl1 - zahl2;
	}
	
	public int multiplizieren(int zahl1, int zahl2) {
		return zahl1 * zahl2;
	}
	
	public int dividieren(int zahl1, int zahl2) throws TaschenrechnerException {
		if(zahl2 == 0){
			throw new TaschenrechnerException("Division durch 0");
		}
		return zahl1 / zahl2;
	}	
}
