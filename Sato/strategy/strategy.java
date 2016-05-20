/** Imports a type of lambdas taking two arguments of the same type T and returning one argument of same type T */
import java.util.function.BinaryOperator;

/** Implements and assigns to variables the lambdas to be used later in configuring Context.
*   FunctionalUtils is just a convenience class, as the code of a lambda
*   might be passed directly to Context constructor, as for ResultD below, in main().
*/
class FunctionalUtils {
	static final BinaryOperator<Integer> add = (final Integer a, final Integer b) -> {
		System.out.println("Called add's apply().");
		return a + b;
	};

	static final BinaryOperator<Integer> subtract = (final Integer a, final Integer b) -> {
		System.out.println("Called subtract's apply().");
		return a - b;
	};

	static final BinaryOperator<Integer> multiply = (final Integer a, final Integer b) -> {
		System.out.println("Called multiply's apply().");
		return a * b;
	};
}
