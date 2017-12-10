/**
 * Conoce a sus observadores y ofrece la posibilidad de añadir y eliminar
 * observadores.
 * 
 * @author unknown
 *
 */
public interface ISubjet<Generico> {
	/**
	 * Para agregar observadores en tiempo de ejecución
	 * 
	 * @param observador
	 */
	public void attach(Generico observador);

	/**
	 * Para eliminar observadores en tiempo de ejecución
	 * 
	 * @param observador
	 */
	public void dettach(Generico observador);

	/**
	 * Para notificar a todos los observadores de que se ha producido el cambio
	 */
	public void notifyObservers();
}
