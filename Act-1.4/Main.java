public class Main {
	public static void main(String[] args) {

Coque coque = new Coque(2);
Voile voile = new Voile(6);
Pont pont = new Pont(4, voile);
Cabine cabine = new Cabine(3);
Bateau bateau = new Bateau(1, coque, cabine, pont);

System.out.println(bateau.toString());
	
	