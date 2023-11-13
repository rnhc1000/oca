package access.modifiers;

/**
 * Cannot reduce the visibility of the inherited method from Food
 */
abstract class Food {
//    protected abstract double getCalories();
	abstract double getCalories();
}

class JunkFood extends Food {
//    double getCalories() {
//  protected getCalories() {

	public double getCalories() {
		return 200.0;
	}
}

public class ProtectedAbstract {

}
