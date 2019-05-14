public interface IF_Device {

	/**
	 * 
	 * @param t
	 * @param o
	 */
	void makeOrder(Table t, Order o);

	/**
	 * 
	 * @param t
	 * @param o
	 */
	void validateOrder(Table t, Order o);

	/**
	 * 
	 * @param o
	 * @param w
	 */
	void notifyWaiter(Order o, Waiter w);

}