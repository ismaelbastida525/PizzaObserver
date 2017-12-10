
public class Main {

	public static void main(String[] args) {
		// Primero agrego a las alarmas las pizzas
		AlarmaPizza alarmaPizza = new AlarmaPizza();
		alarmaPizza.attach(new Hawaiana());
		alarmaPizza.attach(new Iberica());
		alarmaPizza.attach(new CuatroQuesos());

		Almacen almacen = new Almacen();
		almacen.damePizza();
		almacen.damePizza();
		almacen.damePizza();
	}
}
