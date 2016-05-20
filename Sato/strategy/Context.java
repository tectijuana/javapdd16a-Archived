/** Configured with a lambda and maintains a reference to a lambda */
class Context {
	/** a variable referencing a lambda taking two Integer arguments and returning an Integer: */
	private final BinaryOperator<Integer> strategy;
    	
	public Context(final BinaryOperator<Integer> lambda) {
		strategy = lambda;
	}

	public int executeStrategy(final int a, final int b) {
		return strategy.apply(a, b);
	}
}
