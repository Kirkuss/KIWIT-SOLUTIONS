public interface IF_Table {

	/**
	 * 
	 * @param t
	 * @param st
	 */
	void changeState(Table t, State st);

	/**
	 * 
	 * @param t
	 * @param w
	 */
	void assignWaiter(Table t, Waiter w);

	/**
	 * 
	 * @param t
	 */
	void recordStateTime(Table t);

	/**
	 * 
	 * @param t
	 * @param w
	 */
	void warnState(Table t, Waiter w);

}