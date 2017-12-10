import java.util.ArrayList;

public class AlarmaPizza implements ISubjet<IStockInsuficiente> {
	// Sirve para notificar a los observadores los cambios realizados en el Subject
	private static ArrayList<IStockInsuficiente> observadores = new ArrayList<IStockInsuficiente>();

	@Override
	public void attach(IStockInsuficiente observador) {
		observadores.add(observador);
	}

	@Override
	public void dettach(IStockInsuficiente observador) {
		observadores.remove(observador);
	}

	@Override
	public void notifyObservers() {
		for (IStockInsuficiente observador : observadores) {
			observador.update();
		}
	}
}
