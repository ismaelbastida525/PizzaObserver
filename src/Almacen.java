
public class Almacen {
	private int ingredientes = 2;

	public void damePizza() {
		if (ingredientes > 0) {
			ingredientes--;
			System.out.println("Pizza para t�");
		} else {
			AlarmaPizza noStock = new AlarmaPizza();
			noStock.notifyObservers();
		}
	}
}
