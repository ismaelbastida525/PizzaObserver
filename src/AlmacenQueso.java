
public class AlmacenQueso {
	private int mozzarella = 2;
	public void damePizza() {

		if (mozzarella > 0) {
			mozzarella--;
			System.out.println("Pizza para t�");
		} else {
			AlarmaMozzarella noStock = new AlarmaMozzarella();
			noStock.notifyObservers();
		}
	}

}
