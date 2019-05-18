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

}