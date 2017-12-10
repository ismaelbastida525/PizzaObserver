
public class MainDos {

	public static void main(String[] args) {
		AlarmaMozzarella alarmasM = new AlarmaMozzarella();
		alarmasM.attach(new Margarita());
		alarmasM.attach(new CuatroQuesos());
		
		AlmacenQueso almacen = new AlmacenQueso();
		almacen.damePizza();
		almacen.damePizza();
		almacen.damePizza();
	}

}
