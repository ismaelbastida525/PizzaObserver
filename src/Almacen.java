
public class Almacen {
	private int pizzasRestantes = 2;

	public void damePizza() {
		if (pizzasRestantes > 0) {
			pizzasRestantes--;
			System.out.println("Pizza para tí");
		} else {
			AlarmaPizza noStock = new AlarmaPizza();
			noStock.notifyObservers();
		}
	}
}
