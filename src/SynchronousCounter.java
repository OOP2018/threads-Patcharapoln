/**
 * Count number by using synchronized.
 * @author Patcharapol Nirunpornputta
 *
 */
public class SynchronousCounter extends Counter {

	/**
	 * Add amount to counter.
	 */
	@Override
	public synchronized void add(int amount) {
		super.add(amount);
	}
}