import java.util.concurrent.atomic.AtomicLong;
/**
 * Count number by using AtomicLong.
 * @author Patcharapol Nirunpornputta
 *
 */
class AtomicCounter extends Counter {
	private AtomicLong total;

	public AtomicCounter() {
		total = new AtomicLong();
	}

	/**
	 * Add amount to total.
	 */
	public void add(int amount) {
		total.getAndAdd(amount);
	}
	
	/**
	 * @return value of total.
	 */
	public long get() {
		return total.get();
	}
}