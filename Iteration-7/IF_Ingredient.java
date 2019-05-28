public interface IF_Ingredient {

	/**
	 * 
	 * @param i
	 * @param quantity
	 */
	void updateIngredients(Ingredient i, int quantity);

	void warnLowExistences();

}