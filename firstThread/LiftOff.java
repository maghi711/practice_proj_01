public class LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = ++taskCount;
	public LiftOff() {}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "), ";
	}

	public void run() {
		while (countDown-- > 0) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			print(status());
			Thread.yield();
		}
	}
	private void print(Object o) {
		System.out.println(o);
	}
}