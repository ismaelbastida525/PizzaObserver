
public class CuatroQuesos implements Pizza, IStockInsuficiente, IWithOutMozzarella {

	@Override
	public void prepareMasa() {
		// TODO Auto-generated method stub
	}

	@Override
	public void addIngredients() {
		// TODO Auto-generated method stub
	}

	@Override
	public void cookPizza() {
		// TODO Auto-generated method stub
	}

	@Override
	public void update() {
		System.out.println("----------Cuatro Quesos---------");
		System.out.println("Se nos agot� el queso, ir� a por m�s a la tienda");
	}

	@Override
	public void actualizarMozzarella() {
		System.out.println("----------Cuatro Quesos---------");
		System.out.println("Ah� va, que comemos m�s quesos que los ratones, hay que pedir m�s mozzarella");
	}

}
