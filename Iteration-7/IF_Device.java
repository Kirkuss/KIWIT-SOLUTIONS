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

	/**
	 * 
	 * @param o
	 * @param c
	 */
	void warnCooker(Order o, Cooker c);

	/**
	 * 
	 * @param o
	 */
	void printBill(Order o);

	/**
	 * 
	 * @param sta
	 * @param dStats
	 */
	void generateStatistics(Statistic sta, date dStats);

	/**
	 * 
	 * @param sta
	 * @param dStats
	 */
	void viewStatistics(Statistic sta, date dStats);

}