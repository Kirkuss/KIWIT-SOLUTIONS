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

}