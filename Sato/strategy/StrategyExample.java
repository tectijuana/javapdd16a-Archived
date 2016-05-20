public class StrategyExample {

	public static void main(String[] args) {
		Context context;

		context = new Context(FunctionalUtils.add);
		final int resultA = context.executeStrategy(3,4);

		context = new Context(FunctionalUtils.subtract);
		final int resultB = context.executeStrategy(3, 4);

		context = new Context(FunctionalUtils.multiply);
		final int resultC = context.executeStrategy(3, 4);

		context = new Context((final Integer a, final Integer b) -> a * b + 1);
		final int resultD = context.executeStrategy(3,4);

		System.out.println("Result A: " + resultA );
		System.out.println("Result B: " + resultB );
		System.out.println("Result C: " + resultC );
		System.out.println("Result D: " + resultD );
	}
}
