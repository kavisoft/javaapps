public class test extends Throwable {
	public static void main(String[] args) {
		try {
			core c = new core();
			c.metod();

			throw new Throwable();
		} catch (ArithmeticException e) {
			System.out.println("A" + e);
		} catch (Exception e) {
			System.out.println("E" + e);
		} catch (Throwable e) {
			System.out.println("T" + e);
		} finally {
			System.out.println("final");
		}

	}
}
