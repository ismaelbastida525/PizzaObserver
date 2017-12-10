
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
		System.out.println("Se nos agotó el queso, iré a por más a la tienda");
	}

	@Override
	public void actualizarMozzarella() {
		System.out.println("----------Cuatro Quesos---------");
		System.out.println("Ahí va, que comemos más quesos que los ratones, hay que pedir más mozzarella");
	}

}
