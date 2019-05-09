public interface IF_Table {

	/**
	 * 
	 * @param st
	 */
	void changeState(State st);

	/**
	 * 
	 * @param t
	 * @param w
	 */
	void assignWaiter(Tables t, Waiter w);

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