/*
 * Sirve para notificar a los observadores los cambios realizados en el Subject,
 * cada clase que quiera observar el cambio del estado en la pizza deberá 
 * implementar la siguiente interface y darle lógica al método update
 */
public interface IStockInsuficiente {
	public void update();
}
