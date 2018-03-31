import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Count number by using ReentrantLock.
 * @author Patcharapol Nirunpornputta
 *
 */
public class CounterWithLock extends Counter {
	private Lock lock = new ReentrantLock();

	/**
	 * Add amount to total.
	 */
	public void add(int amount) {
		try {
			lock.lock();
			super.add(amount);
		} finally {
			lock.unlock();
		}
	}
}
