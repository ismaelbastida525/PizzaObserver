
public class MainDos {

	public static void main(String[] args) {
		AlarmaMozzarella alarmasM = new AlarmaMozzarella();
		alarmasM.attach(new CuatroQuesos());
		alarmasM.attach(new Margarita());
		
		AlmacenQueso almacen = new AlmacenQueso();
		almacen.damePizza();
		almacen.damePizza();
		almacen.damePizza();
	}

}
