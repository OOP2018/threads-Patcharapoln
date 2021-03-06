/**
 * Subtract number from 1 to limit to Counter.
 * @author Patcharapol Nirunpornputta
 *
 */
public class SubtractTask implements Runnable{
	private Counter counter;
	private int limit;
	
	public SubtractTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}
	
	@Override
	public void run() {
		for (int k = 1; k <= limit; k++)
			counter.add(-k);
		// If you want to see when a thread finishes, add this line:
		 System.out.println("Done "+Thread.currentThread().getName());
	}
}
