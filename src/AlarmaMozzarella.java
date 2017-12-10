import java.util.ArrayList;

public class AlarmaMozzarella implements ISubjet<IWithOutMozzarella> {
	private static ArrayList<IWithOutMozzarella> observadores = new ArrayList<IWithOutMozzarella>();

	@Override
	public void attach(IWithOutMozzarella observador) {
		observadores.add(observador);

	}

	@Override
	public void dettach(IWithOutMozzarella observador) {
		observadores.remove(observador);

	}

	@Override
	public void notifyObservers() {
	for (IWithOutMozzarella quesitos : observadores) {
		quesitos.actualizarMozzarella();
	}

	}

}
